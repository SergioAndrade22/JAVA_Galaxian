package personajes;

import juego.Juego;

public abstract class Strategy {
	protected Malo en;
	protected Mediator mediator;

	public Strategy(Malo e, Mediator med) {
		en = e;
		mediator = med;
	}
	
	public abstract void mover();
	
	public Mediator getMed() {
		return mediator;
	}
}