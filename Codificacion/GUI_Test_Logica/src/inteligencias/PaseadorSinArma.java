package inteligencias;

import java.util.Random;
import mapa.Celda;
import personajes.Malo;

public class PaseadorSinArma extends Strategy{

	public PaseadorSinArma(Malo e) {
		super(e);
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