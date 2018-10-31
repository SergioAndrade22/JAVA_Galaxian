package personajes;

public abstract class Strategy {
	protected Entidad en;
	protected Mediator mediator;

	public Strategy(Entidad e, Mediator med) {
		en = e;
		mediator = med;
	}
	
	public abstract void mover();
}