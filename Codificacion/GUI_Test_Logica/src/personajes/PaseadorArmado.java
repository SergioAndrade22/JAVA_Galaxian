package personajes;

import java.util.Random;

import mapa.Celda;

public class PaseadorArmado extends Strategy {

	public PaseadorArmado(Malo e, Mediator med) {
		super(e,med);
	}

	@Override
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
		disparar();	
	}
	private void disparar() {
		
	}
}
