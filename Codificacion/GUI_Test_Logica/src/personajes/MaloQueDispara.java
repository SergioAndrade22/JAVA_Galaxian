package personajes;

import inteligencias.PaseadorArmado;

public class MaloQueDispara extends Malo{

	public MaloQueDispara() {
		super();
		strat = new PaseadorArmado(this);
	}
}