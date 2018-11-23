package personajes;

import inteligencias.BuscadorArmado;
import inteligencias.Mediator;
import inteligencias.PaseadorSinArma;

public class PerdedorArma extends Malo{
	
	public PerdedorArma(Mediator m) {
		super(m);
		strat=new BuscadorArmado(this,m);
	}
	
	public void disminuirHP(int i) {
		super.disminuirHP(i);
		if(hp<=50)
			strat=new PaseadorSinArma(this, new Mediator());
	}

}
