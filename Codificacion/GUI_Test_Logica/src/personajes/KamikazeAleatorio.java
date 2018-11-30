package personajes;

import inteligencias.BuscadorSinArma;
import inteligencias.PaseadorSinArma;

public class KamikazeAleatorio extends Malo {

	public KamikazeAleatorio(){
		super();
		strat=new BuscadorSinArma(this);
	}
	
	public void disminuirHP(int i) {
		super.disminuirHP(i);
		if(hp<50)
			strat=new PaseadorSinArma(this);
	}

}