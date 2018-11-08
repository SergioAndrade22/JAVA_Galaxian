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
		this.grafico=new BonusGrafico(velocidad,0,0);
		collider=new ColliderPremio(this);
		velocidad=20;
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
		this.grafico = new BarricadaGrafica(velocidad, pos.getX(), pos.getY());		
	}
	public abstract void actuar(Jugador jugador);
	public void mover() {
		super.mover(Celda.LEFT);
	}
}