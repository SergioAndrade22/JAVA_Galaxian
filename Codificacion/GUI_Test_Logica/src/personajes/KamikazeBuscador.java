package personajes;

public class KamikazeBuscador extends Malo{

	public KamikazeBuscador(Mediator med) {
		super(med);
		strat=new BuscadorSinArma(this,med);
	}


}
