package colliders;

import disparo.DisparoEnemigo;
import disparo.DisparoJugador;
import objetos.Barricada;
import objetos.Obstaculo;
import objetos.Premio;
import personajes.*;

public class ColliderJugador implements Collider {
	protected Jugador jugador;

	public ColliderJugador(Jugador j) {
		jugador=j;
	}

	public void collideWith(Malo m) {
		m.morir();
	}

	public void collideWith(DisparoEnemigo de) {
		de.morir();
	}

	public void collideWith(Premio p) {
		p.actuar(jugador);
		p.morir();
	}

	public void collideWith(Barricada b) { /*NADA*/ }

	public void collideWith(Obstaculo o) { /*NADA*/ }

	public void collideWith(Jugador j) { /*NADA*/ }

	public void collideWith(DisparoJugador d) { /*NADA*/ }
}