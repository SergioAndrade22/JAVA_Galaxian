package Colliders;

import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;

public class ColliderJugador implements Collider {
	protected Jugador jugador;

	public ColliderJugador(Jugador j) {
		jugador=j;
	}

	public void collideWith(Malo m) {
		m.disminuirHP(100);
		jugador.disminuirHP(10);
	}

	public void collideWith(DisparoEnemigo de) {
		jugador.disminuirHP(de.getDaño());
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