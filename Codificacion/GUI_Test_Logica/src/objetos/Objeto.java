package objetos;

import personajes.Entidad;
import mapa.Celda;

public abstract class Objeto extends Entidad{

	protected Objeto() {
		hp = 100;
	}
	
	protected Objeto(Celda c){
		super(c);
	}
	
	protected Objeto(Celda c,int hp){
		super(c,hp);
	}
	
	public void congelar() {}
	
	public void descongelar() {}
	
	public void setGrafico() {}
}