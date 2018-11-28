package Objetos;

import personajes.Entidad;
import mapa.Celda;

public abstract class Objeto extends Entidad{

	public Objeto() {
		hp = 100;
	}
	
	public Objeto(Celda c){
		super(c);
	}
	
	public Objeto(Celda c,int hp){
		super(c,hp);
	}
	
	public void congelar() {}
	
	public void descongelar() {}
	
	public void setGrafico() {}
}