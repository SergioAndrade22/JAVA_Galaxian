package personajes;

public class MaloKamikazeBuscador extends Malo {

	public MaloKamikazeBuscador(Mediator med) {
		super();
		strat = new Buscador(this, med);
	}
}
