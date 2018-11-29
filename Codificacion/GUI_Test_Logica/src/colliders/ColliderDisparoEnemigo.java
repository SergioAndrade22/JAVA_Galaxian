package colliders;

import disparo.Disparo;
import disparo.DisparoEnemigo;
import disparo.DisparoJugador;
import objetos.Barricada;
import objetos.Obstaculo;
import objetos.Premio;
import personajes.*;

public class ColliderDisparoEnemigo implements Collider {
	protected Disparo disparo;

	public ColliderDisparoEnemigo(Disparo d) {
		disparo=d;
	}

	public void collideWith(Jugador j) {
		j.disminuirHP(disparo.getDaño());
	}

	public void collideWith(Obstaculo o) {
		o.morir();
	}
	
	public void collideWith(Barricada b) { /*NADA*/ }
	
	public void collideWith(Malo m) { /*NADA*/ }

	public void collideWith(DisparoJugador d) { /*NADA*/ }

	public void collideWith(DisparoEnemigo de) { /*NADA*/ }

	public void collideWith(Premio p) { /*NADA*/ }
}