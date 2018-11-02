package personajes;

import mapa.Celda;

public class Disparador extends Strategy {

	public Disparador(Malo e, Mediator med) {
		super(e, med);
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
		en.disparar();
	}
}