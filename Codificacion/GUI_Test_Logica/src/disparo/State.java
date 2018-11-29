package disparo;


public abstract class State {
	
	protected Disparo disparo;

	public State(DisparoEnemigo d) {
		disparo=d;
	}
	
	public void mover() {
		
	}
}