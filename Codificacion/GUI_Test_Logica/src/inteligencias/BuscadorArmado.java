package inteligencias;

import mapa.Celda;
import personajes.Malo;
import java.util.Random;

import disparo.Arma;
import disparo.ArmaEnemigo;
import disparo.Disparo;

public class BuscadorArmado extends Strategy{

	protected Arma miArma;
	
	public BuscadorArmado(Malo e) {
		super(e);
		miArma=new ArmaEnemigo(e,10);
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
		/*
		Random r = new Random();
		if (r.nextInt(100) < 45)
			disparar();
			*/
	}
	
	private void disparar(){
		Disparo d=miArma.createDisparo();
		mediator.agregarDisparo(d);
	}
}