package personajes;


import juego.Juego;
import mapa.Celda;
public class BuscadorArmado extends Strategy{

	
	protected ArmaEnemigo miArma;
	protected Juego juego;
	
	public BuscadorArmado(Malo e, Mediator med) {
		super(e, med);
		miArma=new ArmaEnemigo(e,10);
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
		Disparo d=miArma.createDisparo();
		mediator.getJuego().agregarDisparo(d);
		
	}
}