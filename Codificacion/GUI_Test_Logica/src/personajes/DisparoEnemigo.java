package personajes;

import mapa.*;
import Colliders.*;
import grafica.*;

public class DisparoEnemigo extends Disparo{
	
	
	public DisparoEnemigo(Celda c, int velocidad, int fuerza){
		super(c,velocidad,5);
		collider=new ColliderDisparoEnemigo();
	}
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	public void mover() {
		
		int direccion;
		direccion = Celda.LEFT;
		this.pos.removeEntidad(this);
		super.mover(direccion);
		this.pos.addEntidad(this);
	}
}