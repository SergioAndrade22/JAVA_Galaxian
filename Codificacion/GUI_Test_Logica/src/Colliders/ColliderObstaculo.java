package Colliders;

import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.Jugador;
import personajes.Malo;

public class ColliderObstaculo implements Collider {
	
	protected Obstaculo obstaculo;

	public ColliderObstaculo(Obstaculo o) {
		obstaculo=o;
	}

	public void collideWith(DisparoJugador d) {
		obstaculo.morir();
		d.morir();		
	}
	
	public void collideWith(DisparoEnemigo d) {
		obstaculo.morir();
		d.morir();		
	}

	public void collideWith(Obstaculo o) { /*NADA*/ }
	
	public void collideWith(Premio p) { /*NADA*/ }

	public void collideWith(Jugador j) { /*NADA*/ }

	public void collideWith(Malo m) { /*NADA*/ }
	
	public void collideWith(Barricada b) { /*NADA*/ }
}