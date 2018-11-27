package inteligencias;

import mapa.Celda;
import personajes.Malo;

public class BuscadorSinArma extends Strategy {

	public BuscadorSinArma(Malo e) {
		super(e);	
	}
	
	public void mover() {		
		int posJugY = mediator.getPosJY();
		int yMalo=en.getPos().getY();
		if(posJugY<yMalo) {
			en.mover(Celda.UP);
		}
		else {
			if(posJugY>yMalo) 
				en.mover(Celda.DOWN);
			else
				en.mover(Celda.LEFT);
		}
	}
}