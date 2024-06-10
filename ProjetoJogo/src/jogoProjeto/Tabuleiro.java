package jogoProjeto;
import java.util.Scanner;

public class Tabuleiro {

	private static final char MARCA_JOGADOR_1 = 'X'; 
	private static final char MARCA_JOGADOR_2 = 'O';
	
    private int[][] matriz;
    protected int jogadorAtual;
    
    public Tabuleiro() {
        matriz = new int[3][3];
        jogadorAtual = 1;
    }

    public void zerarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = 0;
            }
        }
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int getPosicao() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a posição (1-9): ");
        int posicao = sc.nextInt();
        if (posicao < 1 || posicao > 9) {
            System.out.println("Posição inválida!");
            return getPosicao();
        }
        int linha = (posicao - 1) / 3;
        int coluna = (posicao - 1) % 3;
        if (matriz[linha][coluna] != 0) {
            System.out.println("Posição ocupada!");
            return getPosicao();
        }
        return posicao;
    }

    public void setPosicao(int posicao) {
   	 int linha = (posicao - 1) / 3;
     int coluna = (posicao - 1) % 3;

     if (matriz[linha][coluna] != 0) {
    	 System.out.println("Posição ocupada! Tente novamente.");
    	        return;
    	    }

    	    if (jogadorAtual == 1) {
    	        matriz[linha][coluna] = MARCA_JOGADOR_1;
    	    } else {
    	        matriz[linha][coluna] = MARCA_JOGADOR_2;
    	    }

    	    jogadorAtual = (jogadorAtual == 1) ? 2 : 1; 
    	}

    public boolean checaLinhas() {
        for (int i = 0; i < 3; i++) {
            if (matriz[i][0] != 0 && matriz[i][0] == matriz[i][1] && matriz[i][1] == matriz[i][2]) {
                return true;
            }
        }
        return false;
    }
    public boolean checaColunas() {
        for (int i = 0; i < 3; i++) {
            if (matriz[0][i] != 0 && matriz[0][i] == matriz[1][i] && matriz[1][i] == matriz[2][i]) {
                return true;
            }
        }
        return false;
    }

    public boolean checaDiagonais() {
        if (matriz[0][0] != 0 && matriz[0][0] == matriz[1][1] && matriz[1][1] == matriz[2][2]) {
            return true;
        }
        if (matriz[0][2] != 0 && matriz[0][2] == matriz[1][1] && matriz[1][1] == matriz[2][0]) {
            return true;
        }
        return false;
    }

    public boolean tabuleiroCompleto() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public int[][] getMatriz(){
    	return matriz;
    }
}

