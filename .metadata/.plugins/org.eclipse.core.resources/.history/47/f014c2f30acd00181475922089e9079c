package personajes;

import java.awt.event.KeyEvent;
import grafica.JugadorGrafico;
import mapa.Celda;
import Colliders.*;

public class Jugador extends Personajes{
		
	public Jugador(Celda pos) {
		super(pos);
		this.grafico = new JugadorGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider=new ColliderJugador();
		hp=100;
		fuerza_kamikaze=50;
	}

	public void mover(int dir){
		this.pos.removeEntidad(this);
		switch (dir){
		case KeyEvent.VK_UP : //Arriba
			super.mover(KeyEvent.VK_UP);
			break;
		case KeyEvent.VK_DOWN : //Abajo
			super.mover(KeyEvent.VK_DOWN);
			break;
		case KeyEvent.VK_SPACE :
			//aquí va el disparo
			break;
		}
		this.pos.addEntidad(this);
	}
	
	//añadir metodo para disparar
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
}
