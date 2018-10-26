package personajes;

import java.awt.event.KeyEvent;
import grafica.JugadorGrafico;
import mapa.Celda;
import Colliders.*;

public class Jugador extends Personaje{
		
	public Jugador(Celda pos) {
		super(pos);
		this.grafico = new JugadorGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider = new ColliderJugador(this);
		hp=100;
		fuerza_kamikaze=50;
	}

	public void mover(int dir){
		switch (dir){
		case KeyEvent.VK_UP : //Arriba
			super.mover(KeyEvent.VK_UP);
			break;
		case KeyEvent.VK_DOWN : //Abajo
			super.mover(KeyEvent.VK_DOWN);
			break;
		}
		
	}
	
	public Disparo disparar() {
		Celda c = pos.getVecina(KeyEvent.VK_RIGHT);
		Disparo d =new DisparoJugador(c, 50, 5);
		c.addEntidad(d);
		return d;
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	public void aceptar(Collider c) {
		c.collideWith(this);
	}

	public void disminuirHP(int i) {
		hp-=i;		
		if(hp==0)
			System.out.println("Fin de Juego. Perdiste");
	}
	public void aumentarHP(int i) {
		hp+=i;
	}
}
