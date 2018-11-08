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
		j.disminuirHP(disparo.getDaño());
		disparo.morir();
	}
	
	public void collideWith(Malo m) {}

	public void collideWith(DisparoJugador d) {}

	public void collideWith(DisparoEnemigo de) {}

	public void collideWith(Obstaculo o) {
		o.morir();
		System.out.println("Quitar obstaculo");
		disparo.morir();
	}
	
	public void collideWith(Premio p) {}

}
