package personajes;

import mapa.*;
import Colliders.Collider;
import Colliders.ColliderDisparo;
import grafica.*;

public class Disparo extends EntidadMovimiento{
	
	public Disparo(Celda c, int velocidad, int fuerza){
		super(c,velocidad);
		fuerza_kamikaze=5;
		this.grafico = new DisparoGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider=new ColliderDisparo();
	}
	
	public void mover() {
		int direccion;
		direccion = Celda.RIGHT;
		this.pos.removeEntidad(this);
		super.mover(direccion);
		this.pos.addEntidad(this);
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
}