package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;
public class ColliderDisparoJugador implements Collider {
	protected Disparo disparo;

	public ColliderDisparoJugador(Disparo d) {
		disparo=d;
	}

	public void collideWith(Jugador j) {
		disparo.morir();
	}

	public void collideWith(Malo m) {
		m.disminuirHP(disparo.getDaño());
	}
	
	public void collideWith(DisparoJugador d) {}

	public void collideWith(DisparoEnemigo de) {}

	public void collideWith(Obstaculo o) {}

	public void collideWith(Premio p) {}

}
