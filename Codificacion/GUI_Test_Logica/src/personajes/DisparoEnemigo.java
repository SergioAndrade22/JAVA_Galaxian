package personajes;

import mapa.*;
import Colliders.*;
import grafica.DisparoEnemigoGrafico;

public class DisparoEnemigo extends Disparo{

	public DisparoEnemigo(Celda c, int velocidad, int daño){
		super(c,velocidad,daño);
		this.grafico=new DisparoEnemigoGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider=new ColliderDisparoEnemigo(this);
		dir = Celda.LEFT;
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);	
	}
	
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	
	public void mover() {
		if (pos.isStartX())
			pos.eliminarEntidad(this);
		super.mover(dir);
	}
}