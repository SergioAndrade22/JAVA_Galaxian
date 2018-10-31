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
<<<<<<< HEAD
		strat=new Buscador(this, med);
	}
	
	public void mover() {
		strat.mover();
=======
		Random r=new Random();
		if(r.nextInt(2)==1)
			strat=new Paseador(this);
		else 
			strat=new Buscador(this);
	}
	
	public Malo(Celda pos) {
		super(pos);
		this.grafico = new MaloGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider=new ColliderMalo(this);
		hp=50;
		fuerza_kamikaze=50;
		Random r=new Random();
		if(r.nextInt(2)==1)
			strat=new Paseador(this);
		else 
			strat=new Buscador(this);
	}
	
	public void mover(int y) {
		strat.mover(y);
>>>>>>> 1e8c94a9be4456db3667584cb2549e62cd19c2a0
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
<<<<<<< HEAD
		pos.eliminarEntidad(this);
=======
		pos.eliminarMalo(this);
		
>>>>>>> 1e8c94a9be4456db3667584cb2549e62cd19c2a0
	}
	
	public void disminuirHP(int i) {
		hp-=10;
		if(hp<=0)
			morir();
	}
}