package jogoProjeto;

public interface Jogo {
	public abstract boolean jogar();
	public abstract int rodada();
	public abstract int vencer();
	public abstract void iniciarJogadores(); 
}
