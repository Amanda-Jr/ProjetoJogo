package jogoProjeto;
import java.util.Scanner;

public class Jokenpo implements Jogo{
	
	private String jogada[] = new String[3];
	private Computador computador;
	private Humano humano;
	private int rodada;
	private int pontosJogador;
	private int pontosComputador;
	
	Scanner sc = new Scanner(System.in);
	
	public Jokenpo() {
		rodada = 0;
		pontosJogador = 0;
		pontosComputador = 0;
		inicializarJogadas();
		iniciarJogadores();
		while(jogar());
	}
	
	public void inicializarJogadas() {
		this.jogada[0] = "pedra";
		this.jogada[1] = "papel";
		this.jogada[2] = "tesoura";
	}
	
	@Override
	public void iniciarJogadores() {
		this.computador = new Computador(2);
		this.humano = new Humano(1);
		
	}

	@Override
	public boolean jogar() {
		if(vencer()== -1) {
			turno();
			System.out.println("\n\n-------------JOKENPO-------------");
			System.out.println("Rodada: " + rodada);
			
			System.out.println("Escolha sua jogada: [1] pedra [2] papel [3] tesoura");
			int escolhaJogador = humano.jogar();
			
			int escolhaComputador = computador.jogar();
			
			if(jogada[escolhaJogador-1] == jogada[escolhaComputador]) {
				System.out.println("Empate!");
				System.out.println("Jogador e Computador escolheram " + jogada[escolhaJogador-1]);
			} 
			else if(jogada[escolhaJogador-1].equals("pedra") && jogada[escolhaComputador].equals("papel")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Computador ganhou a rodada!");
				pontosComputador++;
			}
			else if(jogada[escolhaJogador-1].equals("pedra") && jogada[escolhaComputador].equals("tesoura")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Jogador ganhou a rodada!");
				pontosJogador++;
			}
			else if(jogada[escolhaJogador-1].equals("papel") && jogada[escolhaComputador].equals("pedra")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Jogador ganhou a rodada!");
				pontosJogador++;
			}
			else if(jogada[escolhaJogador-1].equals("papel") && jogada[escolhaComputador].equals("tesoura")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Computador ganhou a rodada!");
				pontosComputador++;
			}
			else if(jogada[escolhaJogador-1].equals("tesoura") && jogada[escolhaComputador].equals("papel")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Jogador ganhou a rodada!");
				pontosJogador++;
			}
			else if(jogada[escolhaJogador-1].equals("tesoura") && jogada[escolhaComputador].equals("pedra")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Computador ganhou a rodada!");
				pontosComputador++;
				
			}
			
			
			
			return true;
		}
		
		else {
			System.out.println("\nPontuacao final");
			System.out.println("Computador: " + pontosComputador);
			System.out.println("Jogador: " + pontosJogador);
			
			switch(vencer()) {
				case 1:
					System.out.println("Resultado final: Jogador venceu!");
				break;
				
				case 2:
					System.out.println("Resultado final: Computador venceu!");
				break;
				
				case 0:
					System.out.println("Resultado final: Empate!");
				break;
				
				default:
					System.out.println("pontuacao errada");
			}
			
			
			return false;
		}
	}

	@Override
	public int turno() {
		rodada++;
		return rodada;
	}

	@Override
	public int vencer() {
		
		 if(rodada == 3){
			if(pontosJogador > pontosComputador)
				return 1;
			else if(pontosJogador < pontosComputador) {
				return 2;
			}
			else if(pontosJogador == pontosComputador) {
				return 0;
			}
			
		 }
		
		return -1;
	}

	

	

	
	
}
