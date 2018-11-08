package Colliders;

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

	@Override
	public void collideWith(DisparoJugador d) {}

	@Override
	public void collideWith(DisparoEnemigo de) {
		de.morir();
		jugador.disminuirHP(10);
	}

	@Override
	public void collideWith(Obstaculo o) {
		o.morir();
		
	}

	@Override
	public void collideWith(Premio p) {
		p.actuar(jugador);
	}

}
