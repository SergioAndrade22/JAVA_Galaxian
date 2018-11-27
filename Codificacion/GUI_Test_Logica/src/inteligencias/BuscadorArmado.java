package inteligencias;

import Disparo.ArmaEnemigo;
import Disparo.Disparo;
import juego.Juego;
import mapa.Celda;
import personajes.Malo;
import java.util.Random;

public class BuscadorArmado extends Strategy{

	protected ArmaEnemigo miArma;
	protected Juego juego;
	
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
		Random r = new Random();
		if (r.nextInt(10) < 5)
			disparar();
	}
	
	private void disparar(){
		Disparo d=miArma.createDisparo();
		mediator.agregarDisparo(d);
		
	}
}