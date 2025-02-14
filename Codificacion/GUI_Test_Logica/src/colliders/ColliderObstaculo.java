package colliders;

import java.util.Random;

import disparo.DisparoEnemigo;
import disparo.DisparoJugador;
import mapa.Celda;
import objetos.Barricada;
import objetos.Obstaculo;
import objetos.Premio;
import personajes.Jugador;
import personajes.Malo;

public class ColliderObstaculo implements Collider {
	
	protected Obstaculo obstaculo;

	public ColliderObstaculo(Obstaculo o) {
		obstaculo=o;
	}

	public void collideWith(DisparoJugador d) {
		d.morir();		
	}
	
	public void collideWith(DisparoEnemigo d) {
		d.morir();		
	}

	public void collideWith(Malo m) {
		Random r=new Random();
		if(r.nextInt(100)<50) 
			m.mover(Celda.DOWN);
		else
			m.mover(Celda.UP);
	}
	
	public void collideWith(Barricada b) { /*NADA*/ }
	
	public void collideWith(Obstaculo o) { /*NADA*/ }
	
	public void collideWith(Premio p) { /*NADA*/ }

	public void collideWith(Jugador j) { /*NADA*/ }
}