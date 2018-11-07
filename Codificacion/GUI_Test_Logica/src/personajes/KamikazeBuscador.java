package personajes;

public class KamikazeBuscador extends Malo{

	public KamikazeBuscador(Mediator med) {
		super();
		strat=new BuscadorSinArma(this,med);
	}


}
