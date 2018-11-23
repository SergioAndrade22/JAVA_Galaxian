package personajes;

import inteligencias.BuscadorArmado;
import inteligencias.PaseadorSinArma;

public class PerdedorArma extends Malo{
	
	public PerdedorArma() {
		super();
		strat = new BuscadorArmado(this);
	}
	
	public void disminuirHP(int i) {
		super.disminuirHP(i);
		if(hp<=50)
			strat=new PaseadorSinArma(this);
	}
}