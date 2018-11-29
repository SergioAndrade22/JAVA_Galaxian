package colliders;

import disparo.Disparo;
import disparo.DisparoEnemigo;
import disparo.DisparoJugador;
import objetos.Barricada;
import objetos.Obstaculo;
import objetos.Premio;
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