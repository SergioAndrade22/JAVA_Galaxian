package personajes;

import inteligencias.PaseadorSinArma;

public class KamikazePaseador extends Malo {

	public KamikazePaseador() {
		super();
		strat=new PaseadorSinArma(this);
	}
}