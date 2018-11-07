package personajes;

import mapa.Celda;

public class BuscadorSinArma extends Strategy {

	public BuscadorSinArma(Malo e, Mediator med) {
		super (e,med);
	}
	public BuscadorSinArma(Malo e) {
		super(e,null);
		
	}
	public void mover() {		
		Celda posJug = mediator.getPosJ();
		int yMalo=en.getPos().getY();
		if(posJug.getY()<yMalo) {
			en.mover(Celda.UP);
		}
		else {
			if(posJug.getY()>yMalo) 
				en.mover(Celda.DOWN);
			else
				en.mover(Celda.LEFT);
		}
	}

}
