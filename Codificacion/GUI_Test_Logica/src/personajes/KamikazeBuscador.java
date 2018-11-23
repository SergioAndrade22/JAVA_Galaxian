package personajes;

import inteligencias.BuscadorSinArma;

public class KamikazeBuscador extends Malo{

	public KamikazeBuscador() {
		super();
		strat=new BuscadorSinArma(this);
	}
}