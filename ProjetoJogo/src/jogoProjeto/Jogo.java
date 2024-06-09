package jogoProjeto;

public interface Jogo {
	public abstract boolean jogar();
	public abstract     int turno();
	public abstract int vencer();
	public abstract void iniciarJogadores(); 
}
