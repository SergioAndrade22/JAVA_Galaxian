package Colliders;

import Disparo.Disparo;
import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;

public class ColliderDisparoJugador implements Collider {
	protected Disparo disparo;

	public ColliderDisparoJugador(Disparo d) {
		disparo=d;
	}

	public void collideWith(Malo m) {
		m.disminuirHP(disparo.getDaño());
	}

	public void collideWith(Obstaculo o) {
		o.morir();
	}

	public void collideWith(Barricada b) {
		b.morir();
	}
	
	public void collideWith(Jugador j) { /*NADA*/ }

	public void collideWith(DisparoJugador d) { /*NADA*/ }

	public void collideWith(DisparoEnemigo de) { /*NADA*/ }

	public void collideWith(Premio p) { /*NADA*/ }

}