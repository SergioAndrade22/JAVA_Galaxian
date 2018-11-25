package personajes;

public abstract class State {
	protected Jugador j;
	protected int vida;
	
	public abstract void disminuirHP(int i);
	public abstract void completarHP();
	public abstract int getVida();
}
