package jogoProjeto;
import java.util.Random;

public class Computador extends Jogador{
    
	private Random jogada = new Random();
	
	
    public Computador(int jogador){
        super(jogador);
        System.out.println("Jogador 'Computador' criado!");
    }
    
    @Override
    public void jogar(Tabuleiro tabuleiro){
    	Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }
    
    public int jogar() {
    	return jogada.nextInt(3);
    }
    
    @Override
    public void Tentativa(Tabuleiro tabuleiro){
        do{
            do{
                tentativa[0] = jogada.nextInt(3) + 1;
                
            }while( tentativa[0] > 3 || tentativa[0] < 1);
            
            do{
                tentativa[1] = jogada.nextInt(3) + 1;
              
                
            }while(tentativa[1] > 3 || tentativa[1] < 1);
            
            tentativa[0]--; 
            tentativa[1]--;
            
        }while( !checaTentativa(tentativa, tabuleiro) );
    }
}
