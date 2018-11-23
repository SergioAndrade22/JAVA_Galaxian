package personajes;

import inteligencias.Mediator;
import inteligencias.PaseadorSinArma;

public class KamikazePaseador extends Malo {

	public KamikazePaseador(Mediator med) {
		super(med);
		strat=new PaseadorSinArma(this,med);
		
	}

}
