package Objetos;
import Colliders.Collider;
import mapa.*;
import personajes.Entidad;

public class Obstaculo extends Objeto{
	
	public Obstaculo(Celda c){
		super(c);
	}
	
	public Obstaculo(Celda c, int hp){
		super(c,hp);

	}

	@Override
	public void colision(Entidad e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void aceptar(Collider c) {
		// TODO Auto-generated method stub
		
	}


}
