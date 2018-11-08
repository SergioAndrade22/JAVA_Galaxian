package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.DisparoEnemigo;
import personajes.DisparoJugador;
import personajes.Jugador;
import personajes.Malo;

public class ColliderObstaculo implements Collider {
	
	protected Obstaculo obstaculo;

	public ColliderObstaculo(Obstaculo o) {
		obstaculo=o;
	}

	public void collideWith(Jugador j) {}

	public void collideWith(Malo m) {}

	public void collideWith(DisparoJugador d) {}

	public void collideWith(DisparoEnemigo de) {
		obstaculo.morir();
		System.out.println("Quitar obstaculo");
		de.morir();		
	}

	public void collideWith(Obstaculo o) {}
	
	public void collideWith(Premio p) {}

}
