package personajes;

import java.util.Random;

import juego.Juego;
import mapa.Celda;

public class PaseadorArmado extends Strategy {

	protected Arma miArma;
	
	public PaseadorArmado(Malo e, Mediator med) {
		super(e,med);
		miArma=new Arma(e,10);
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
	private void disparar(){
		Disparo d=miArma.createDisparo();
		mediator.getJuego().agregarDisparo(d);
	}
}
