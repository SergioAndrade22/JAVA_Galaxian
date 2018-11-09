package personajes;

public class KamikazePaseador extends Malo {

	public KamikazePaseador(Mediator med) {
		super(med);
		strat=new PaseadorSinArma(this,med);
		
	}

}
