package personajes;

import java.util.Random;

import mapa.Celda;

public class PaseadorSinArma extends Strategy{

	public PaseadorSinArma(Malo e, Mediator med) {
		super(e, med);
	}
	

	public void mover() {
		Random r = new Random();		
		int dir = r.nextInt(3);		
		int direccion = -1;
		switch (dir) {
			case 0 : //Arriba
				direccion = Celda.UP;
				break;
			case 1 : //Abajo
				direccion = Celda.DOWN;
				break;
			case 2 : //Izquierda
				direccion = Celda.LEFT;
				break;
		}
		en.mover(direccion);
	}
}
