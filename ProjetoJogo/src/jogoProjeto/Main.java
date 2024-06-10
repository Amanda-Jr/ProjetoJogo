package jogoProjeto;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha um jogo: [1]Jogo da velha [2]Jokenpo");
		int escolha = sc.nextInt();
		
		switch (escolha) {
		case 1: {
			
			JogoDaVelha j1 = new JogoDaVelha();
			break;
			
		}
		case 2: {
			
			Jokenpo jkp = new Jokenpo();
			break;
			
		}
		default:
			System.out.println("Valor invalido! Escolha novamente");
			main(args);
		}
		
		sc.close();
	}

}
