package Colliders;

import personajes.*;

public class ColliderJugador implements Collider {

	public ColliderJugador() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collideWith(Jugador j) {
		System.out.println("Imposible");
	}

	@Override
	public void collideWith(Malo m) {
		System.out.println("Me saca vida");

	}

}
