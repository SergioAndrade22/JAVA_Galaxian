package personajes;

public abstract class Strategy {
	protected Malo m;

	public Strategy(Malo malo) {
		m=malo;
	}
	public void mover(int y) {
	}
}
