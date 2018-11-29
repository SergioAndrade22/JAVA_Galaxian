package objetos;

import colliders.Collider;
import colliders.ColliderObstaculo;
import grafica.ObstaculoGrafico;
import mapa.Celda;
import personajes.Entidad;

public class Obstaculo extends Objeto{
	
	public Obstaculo() {
		grafico=new ObstaculoGrafico(velocidad,0,0);
		collider = new ColliderObstaculo(this);
		hp = 100;
	}
	
	public Obstaculo(Celda c){
		super(c);
		grafico = new ObstaculoGrafico(velocidad, c.getX(), c.getY());
		collider = new ColliderObstaculo(this);
		hp = 100;
	}
	
	public Obstaculo(Celda c, int hp){
		super(c,hp);
		grafico=new ObstaculoGrafico(velocidad, c.getX(),c.getY());
		collider = new ColliderObstaculo(this);
		hp = 100;
		
	}

	public void colision(Entidad e) {
		e.aceptar(collider);
	}

	public void aceptar(Collider c) {
		c.collideWith(this);
	}

	public void setGrafico() {
		this.grafico = new ObstaculoGrafico(velocidad, pos.getX(), pos.getY());		
	}
	
	public void recibirDaño(int dmg) {
		hp -= dmg;
		if (hp < 0)
			super.morir();
	}
	
	public void mover() {}
}