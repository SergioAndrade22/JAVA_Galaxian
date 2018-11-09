package Colliders;

import Disparo.Disparo;
import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;

public class ColliderDisparoEnemigo implements Collider {
	protected Disparo disparo;

	public ColliderDisparoEnemigo(Disparo d) {
		disparo=d;
	}

	public void collideWith(Jugador j) {
		j.disminuirHP(disparo.getDaño());
		disparo.morir();
	}

	public void collideWith(Obstaculo o) {
		o.morir();
		disparo.morir();
	}
	
	public void collideWith(Barricada b) { /*NADA*/ }
	
	public void collideWith(Malo m) { /*NADA*/ }

	public void collideWith(DisparoJugador d) { /*NADA*/ }

	public void collideWith(DisparoEnemigo de) { /*NADA*/ }

	public void collideWith(Premio p) { /*NADA*/ }
}