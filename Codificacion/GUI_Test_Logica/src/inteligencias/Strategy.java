package inteligencias;

import personajes.Entidad;

public abstract class Strategy {
	protected Entidad en;
	protected Mediator mediator;
	
	public Strategy(Entidad e) {
		en = e;
		mediator = Mediator.getInstance();
	}
	
	public abstract void mover();
}