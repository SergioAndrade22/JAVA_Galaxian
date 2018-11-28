package personajes;

public abstract class State {
	protected Jugador j;
	protected int vida = 100;
	
	public void disminuirHP(int i) {
		vida-=i;
		if(vida<=0) {
			j.loss();
			System.out.printf("El jugador murio.");
		}
	}
	
	public void completarHP() {
		vida=100;
	}
	
	public int getVida() {
		return vida;
	}
	
	public abstract void recibirGolpe(int i);
}