package personajes;

public class MaloKamikazeVariante extends Malo {

	public MaloKamikazeVariante(Mediator med) {
		super();
		strat = new Buscador(this, med);
	}
	
	public void disminuirHP(int i) {
		hp -= i;
		if (hp <= 50)
			strat = new Paseador(this, strat.getMed());
		if (hp <= 0)
			morir();
	}
}