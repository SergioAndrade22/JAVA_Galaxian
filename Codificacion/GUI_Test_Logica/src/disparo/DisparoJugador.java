package disparo;

import colliders.*;
import inteligencias.Mediator;
import mapa.Celda;
import personajes.Entidad;

public abstract class DisparoJugador extends Disparo{
	
	public DisparoJugador(Celda c, int velocidad, int fuerza){
		super(c,velocidad,5);
		collider=new ColliderDisparoJugador(this);
		dir = Celda.RIGHT;
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);
	}
	
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	
	public void mover() {
		if (pos.isEndX()) {
			Mediator.getInstance().removerEntidad(this);
		}
		else
			super.mover(dir);
	}
	
	public void congelar() {}
	
	public void descongelar() {}
}