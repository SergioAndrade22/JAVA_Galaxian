package personajes;

import mapa.Celda;
import personajes.Jugador;
public class BuscadorArmado extends Strategy{

	protected Jugador j;
	
	public BuscadorArmado(Malo e, Mediator med) {
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
		disparar();
	}
	private void disparar(){
		
	}
}