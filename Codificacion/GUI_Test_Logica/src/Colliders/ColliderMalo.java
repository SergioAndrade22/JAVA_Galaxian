package Colliders;

import personajes.*;

public class ColliderMalo implements Collider {

	public ColliderMalo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collideWith(Jugador j) {
		System.out.println("Choque, quitale vida al jugador y mori.");

	}

	@Override
	public void collideWith(Malo m) {
		System.out.println("No hacemos nada");
	}

	@Override
	public void collideWith(Disparo d) {
		d.eliminar();
		
	}

}
