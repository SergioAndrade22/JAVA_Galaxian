package Objetos;

import mapa.Celda;

public abstract class Objeto_precioso extends Premio {
	
	public Objeto_precioso(Celda c){
		super(c);
	}
	
	public Objeto_precioso(Celda c, int hp){
		super(c,hp);
	}

}
