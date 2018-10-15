package Colliders;

import personajes.*;
public class ColliderDisparo implements Collider {

	public ColliderDisparo() {
		// TODO Auto-generated constructor stub
	}

	public void collideWith(Jugador j) {
		j.disminuirHP(10);
		System.out.println("Choque jugador");

	}

	public void collideWith(Malo m) {
		m.eliminar();
		System.out.println("Matar enemigo");
	}
	public void collideWith(Disparo d) {
		//Nada
	}

}
