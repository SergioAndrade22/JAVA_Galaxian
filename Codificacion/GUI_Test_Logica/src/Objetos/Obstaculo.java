package Objetos;
import Colliders.Collider;
import Colliders.ColliderObstaculo;
import mapa.*;
import personajes.Entidad;

public class Obstaculo extends Objeto{
	
	public Obstaculo(Celda c){
		super(c);
		collider=new ColliderObstaculo(this);
	}
	
	public Obstaculo(Celda c, int hp){
		super(c,hp);
		collider=new ColliderObstaculo(this);
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}

	
	public void aceptar(Collider c) {
		c.collideWith(this);
		
	}

	public void mover() {}
	public void morir() {
		super.morir();
		pos.setObstaculo(false);
	}
}
