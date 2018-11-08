package personajes;



import java.util.Random;

import Colliders.*;
import grafica.MaloGrafico;
import juego.Juego;

public class Malo extends Personaje{
	protected Strategy strat;
	protected Juego juego;

	public Malo(Mediator m) {
		super();
		collider=new ColliderMalo(this);
		hp=50;
		fuerza_kamikaze=50;
		grafico = new MaloGrafico(velocidad,0,0);
		juego=m.getJuego();
	}
	
	public Malo(Strategy s) {
		super();
		collider=new ColliderMalo(this);
		hp=50;
		fuerza_kamikaze=50;
		strat=s;
		
	}
	public void mover() {
		strat.mover();
	}
	
	/*public Disparo disparar() {
		Celda c = pos.getVecina(KeyEvent.VK_RIGHT);
		Disparo d = new DisparoEnemigo(c, 50, 5);
		c.addEntidad(d);
		return d;
		
	}*/
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	
	public void morir() {
		pos.eliminarEntidad(this);
		Random r=new Random();
		if(r.nextInt(5)>3)
			juego.insertarPremio(pos);
	}
	
	public void disminuirHP(int i) {
		hp-=10;
		if(hp<=0)
			morir();
	}
	public void setEstrategia(Strategy s) {
		strat=s;
	}

	
}