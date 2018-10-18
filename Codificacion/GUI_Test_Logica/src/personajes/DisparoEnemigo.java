package personajes;

import mapa.*;
import Colliders.*;

public class DisparoEnemigo extends Disparo{

	public DisparoEnemigo(Celda c, int velocidad, int fuerza){
		super(c,velocidad,5);
		collider=new ColliderDisparoEnemigo();
		dir = Celda.LEFT;
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	
	public void mover() {
		super.mover(dir);
	}
}