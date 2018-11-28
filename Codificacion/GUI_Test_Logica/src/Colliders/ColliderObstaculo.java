package Colliders;

import java.util.Random;
import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;
import mapa.Celda;
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