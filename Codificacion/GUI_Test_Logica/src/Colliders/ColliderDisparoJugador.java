package Colliders;

import personajes.*;
public class ColliderDisparoJugador implements Collider {

	public ColliderDisparoJugador() {
		// TODO Auto-generated constructor stub
	}

	public void collideWith(Jugador j) {
		//Nada

	}

	public void collideWith(Malo m) {
		m.morir();
		System.out.println("Matar enemigo");
	}
	public void collideWith(DisparoJugador d) {
		//Nada
	}

	@Override
	public void collideWith(DisparoEnemigo de) {
		// Supongo que nada pero preguntar
		
	}

}
