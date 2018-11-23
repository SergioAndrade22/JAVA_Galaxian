package personajes;

import inteligencias.Mediator;
import inteligencias.PaseadorArmado;

public class MaloQueDispara extends Malo{

	public MaloQueDispara(Mediator m) {
		super(m);
		strat=new PaseadorArmado(this,m);
	}
	

}
