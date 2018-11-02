package personajes;

public class MaloQueDispara extends Malo {
	
	public MaloQueDispara(Mediator med) {
		super();
		strat = new Disparador(this, med);
	}
}