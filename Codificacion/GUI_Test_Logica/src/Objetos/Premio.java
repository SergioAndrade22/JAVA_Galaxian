package Objetos;

import Colliders.Collider;
import Colliders.ColliderPremio;
import grafica.BarricadaGrafica;
import grafica.BonusGrafico;
import mapa.Celda;
import personajes.*;

public abstract class Premio extends Objeto { //Sirve para diferenciar de los obstaculos y barricadas. Tal vez podriamos borrarlo y
												// dejar magia temporal y objeto precioso extendiendo de Objeto.
												//Premio podría ser un paquete.
	
	public Premio(Celda c){
		super(c);
		this.grafico=new BonusGrafico(velocidad,c.getX(),c.getY());
		collider=new ColliderPremio(this);
		velocidad=20;
	}
	public Premio() {
		
	}
	
	public Premio(Celda c, int hp){
		super(c,hp);
	}

	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}

	@Override
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	public void setGrafico() {
		this.grafico = new BonusGrafico(velocidad, pos.getX(), pos.getY());		
	}
}
