package Colliders;

import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;

public class ColliderJugador implements Collider {
	protected Jugador jugador;

	public ColliderJugador(Jugador j) {
		jugador=j;
	}

	public void collideWith(Jugador j) {}

	@Override
	public void collideWith(Malo m) {
		m.morir();
		jugador.recibirGolpe();
	}

	public void collideWith(DisparoJugador d) {}

	public void collideWith(DisparoEnemigo de) {
		de.morir();
		jugador.disminuirHP(10);
	}

	public void collideWith(Obstaculo o) {
		o.morir();
		
	}

	public void collideWith(Premio p) {
		p.actuar(jugador);
		p.morir();
	}
}