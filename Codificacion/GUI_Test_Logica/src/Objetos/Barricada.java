package Objetos;

import Colliders.Collider;
import mapa.Celda;
import personajes.Entidad;

public class Barricada extends Objeto{
	
	public Barricada(Celda c){
		super(c);
	}
	
	public Barricada(Celda c, int hp){
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
