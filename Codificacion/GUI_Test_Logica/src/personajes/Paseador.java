package personajes;

import java.util.Random;

import mapa.Celda;

public class Paseador extends Strategy{

	public Paseador(Malo m) {
		super(m);
	}

	public void mover(int y) {
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
		m.moverA(direccion);
	}
}
