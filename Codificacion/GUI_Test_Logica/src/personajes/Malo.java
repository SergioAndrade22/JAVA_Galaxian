package personajes;

import java.awt.event.KeyEvent;

import Colliders.*;
import mapa.Celda;

public class Malo extends Personaje{
	protected Strategy strat;

	public Malo() {
		super();
		collider=new ColliderMalo(this);
		hp=50;
		fuerza_kamikaze=50;
	}
	
	public void mover() {
		strat.mover();
	}
	
	public Disparo disparar() {
		Celda c = pos.getVecina(KeyEvent.VK_RIGHT);
		Disparo d = new DisparoEnemigo(c, 50, 5);
		c.addEntidad(d);
		return d;
		
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	
	public void morir() {
		pos.eliminarEntidad(this);
	}
	
	public void disminuirHP(int i) {
		hp-=10;
		if(hp<=0)
			morir();
	}
}