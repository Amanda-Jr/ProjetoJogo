package jogoProjeto;
import java.util.Scanner;

public class Jokenpo implements Jogo{
	
	private String jogada[] ;
	private Computador computador;
	private Humano humano;
	private int rodada;
	private int vencer;
	
	Scanner sc = new Scanner(System.in);
	
	public Jokenpo() {
		jogada = new String[3];
		rodada = 1;
		vencer = -1;
		while(jogar());
	}
	
	public void inicializarJogadas() {
		this.jogada[0] = "pedra";
		this.jogada[1] = "papel";
		this.jogada[2] = "tesoura";
	}
	
	@Override
	public void iniciarJogadores() {
		this.computador = new Computador();
		this.humano = new Humano();
		
	}

	@Override
	public boolean jogar() {
		if(vencer()== -1) {
			System.out.println("-------------JOKENPO-------------");
			System.out.println("Rodada: " + rodada);
			
			System.out.println("Escolha sua jogada: [1] pedra [2] papel [3] tesoura");
			int escolhaJogador = sc.nextInt();
			
			double aleatorio = Math.random() * 3;
			int escolhaComputador = (int)aleatorio;
			
			if(jogada[escolhaJogador] == jogada[escolhaComputador]) {
				System.out.println("Empate!");
				System.out.println("Jogador e Computador escolheram " + jogada[escolhaJogador]);
			} 
			else if(jogada[escolhaJogador].equals("pedra") && jogada[escolhaComputador].equals("papel")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Computador ganhou!");
			}
			else if(jogada[escolhaJogador].equals("pedra") && jogada[escolhaComputador].equals("tesoura")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Jogador ganhou!");
			}
			else if(jogada[escolhaJogador].equals("papel") && jogada[escolhaComputador].equals("pedra")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Jogador ganhou!");
			}
			else if(jogada[escolhaJogador].equals("papel") && jogada[escolhaComputador].equals("tesoura")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Computador ganhou!");
			}
			else if(jogada[escolhaJogador].equals("tesoura") && jogada[escolhaComputador].equals("papel")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Jogador ganhou!");
			}
			else if(jogada[escolhaJogador].equals("tesoura") && jogada[escolhaComputador].equals("pedra")) {
				System.out.println("Computador escolheu " + jogada[escolhaComputador]);
				System.out.println("Computador ganhou!");
				
				//somar pontos dos jogadores
			}
			
			return true;
		}
		
		else {
			if(vencer() == 1) {
				System.out.println("Jogador venceu!");
			} 
			//System.out.println("Computador venceu!");
			return false;
		}
	}

	

	@Override
	public int vencer() {
		/*
		 * if(pontosJogador > pontosComputador){
		 * 	return 1;
		 * }
		 */
		return 0;
	}

	

	
	
}
