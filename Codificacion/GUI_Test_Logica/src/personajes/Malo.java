package personajes;

import java.util.Random;
import Colliders.*;
import grafica.MaloGrafico;
import inteligencias.Congelado;
import inteligencias.Mediator;
import inteligencias.Strategy;
import juego.Juego;
import mapa.Celda;
import Objetos.PocionMagica;
import Objetos.SuperMisil;

public class Malo extends Personaje{
	protected Strategy strat;
	protected Juego juego;
	protected Strategy anterior;
	
	public Malo() {
		super();
		collider = new ColliderMalo(this);
		hp = 50;
		fuerza_kamikaze = 50;
		grafico = new MaloGrafico(velocidad,0,0);
		juego = Mediator.getInstance().getJuego();
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
	
	public void colision(Entidad e) {
		e.aceptar(collider);
	}
	
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	
	public void morir() {
		super.morir();
		Random r=new Random();
		//if(r.nextInt(5)>3)
			juego.insertarPremio(pos);
		juego.scoreUp();
	}
	
	public void disminuirHP(int i) {
		hp-=10;
		if(hp<=0)
			morir();
	}
	
	public void setEstrategia(Strategy s) {
		strat=s;
	}

	public void congelar() {
		anterior=strat;
		strat=new Congelado(this);
	}
	
	public void descongelar() {
		if(anterior!=null) {
			strat=anterior;
			anterior=null;
		}
	}
	
	public void mover(int dir) {
		synchronized (pos) {
			Celda next = this.pos.getVecina(dir);
			while(next.esObstaculo()) {
				switch(dir) {
					case Celda.DOWN: dir=Celda.LEFT;break;
					case Celda.LEFT: dir=Celda.UP;break;
					case Celda.RIGHT: dir=Celda.DOWN;break;
					case Celda.UP: dir=Celda.RIGHT;break;
				}
				next=pos.getVecina(dir);
			}
			this.pos.removeEntidad(this);
			this.pos = next;
			this.grafico.mover(dir);
			pos.addEntidad(this);
		}
	}

	public int getGolpe() {
		return fuerza_kamikaze;
	}
}