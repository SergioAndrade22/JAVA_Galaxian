package Colliders;

import personajes.DisparoEnemigo;
import personajes.DisparoJugador;
import personajes.Jugador;
import personajes.Malo;

public class ColliderDisparoEnemigo implements Collider {

	public ColliderDisparoEnemigo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collideWith(Jugador j) {
		j.disminuirHP(10);
		System.out.println("Choque jugador");
	}

	@Override
	public void collideWith(Malo m) {
		//NADA
	}

	@Override
	public void collideWith(DisparoJugador d) {
		// Nada

	}

	@Override
	public void collideWith(DisparoEnemigo de) {
		// Nada

	}

}
