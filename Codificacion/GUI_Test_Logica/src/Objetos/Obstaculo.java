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

	}

	@Override
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}

	@Override
	public void aceptar(Collider c) {
		c.collideWith(this);
		
	}


}
