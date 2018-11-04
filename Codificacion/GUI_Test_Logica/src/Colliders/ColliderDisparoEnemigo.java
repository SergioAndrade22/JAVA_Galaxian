package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;

public class ColliderDisparoEnemigo implements Collider {
	protected Disparo disparo;

	public ColliderDisparoEnemigo(Disparo d) {
		disparo=d;
	}

	@Override
	public void collideWith(Jugador j) {
		j.disminuirHP(10);
		disparo.morir();
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

	@Override
	public void collideWith(Obstaculo o) {
		o.morir();
		System.out.println("Quitar obstaculo");
		disparo.morir();
		
	}

	@Override
	public void collideWith(Premio p) {
		// TODO Auto-generated method stub
		
	}

}
