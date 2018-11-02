package personajes;

public class MaloKamikazePaseador extends Malo {

	public MaloKamikazePaseador(Mediator med) {
		super();
		strat = new Paseador(this, med);
	}
}