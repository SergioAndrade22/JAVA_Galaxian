package personajes;

import java.util.Random;

import Colliders.*;

public class Malo extends Personaje{
	protected Strategy strat;

	public Malo(Mediator med) {
		super();
		collider=new ColliderMalo(this);
		hp=50;
		fuerza_kamikaze=50;
		strat=new Buscador(this, med);
	}
	
	public void mover() {
		strat.mover();
	}
	
	public Disparo disparar() {
		Disparo d = new DisparoEnemigo(pos, 100, 5);
		pos.addEntidad(d);
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