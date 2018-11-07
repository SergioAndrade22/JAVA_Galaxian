package personajes;

public class KamikazePaseador extends Malo {

	public KamikazePaseador(Mediator med) {
		super();
		strat=new PaseadorSinArma(this,med);
		
	}

}
