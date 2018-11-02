package personajes;

public class MaloQuePierdeArma extends Malo {

	public MaloQuePierdeArma(Mediator med) {
		super();
		strat = new Disparador(this, med);
	}
	
	public void disminuirHP(int i) {
		hp-=10;
		if (hp <= 50)
			strat = new Buscador(this, strat.getMed());
		if(hp<=0)
			morir();
	}
}