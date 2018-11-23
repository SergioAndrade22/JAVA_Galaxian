package inteligencias;

import personajes.Malo;

public abstract class Strategy {
	protected Malo en;
	protected Mediator mediator;
	
	public Strategy() {}

	public Strategy(Malo e, Mediator med) {
		en = e;
		mediator = med;
	}
	
	public abstract void mover();
	
	public Mediator getMed() {
		return mediator;
	}
}