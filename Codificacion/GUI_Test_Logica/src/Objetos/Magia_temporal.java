package Objetos;

import mapa.Celda;
public abstract class Magia_temporal extends Premio {
	
	protected static int duracion; //Tiempo que está activo el bonus.
	
	
	public Magia_temporal(Celda c){
		super(c);
	}
	
	public Magia_temporal(Celda c, int hp){
		super(c,hp);
	}
	
	public Magia_temporal(Celda c, int hp, int duracion){
		super(c,hp);
		this.duracion=duracion;
	}
	
}