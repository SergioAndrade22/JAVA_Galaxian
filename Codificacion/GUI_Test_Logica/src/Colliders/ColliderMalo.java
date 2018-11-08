package Colliders;

import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;

public class ColliderMalo implements Collider {

	protected Malo malo;
	public ColliderMalo(Malo m) {
		malo=m;
	}

	public void collideWith(Jugador j) {
		malo.morir();
		j.recibirGolpe();
	}

	public void collideWith(Malo m) {}

	public void collideWith(DisparoJugador d) {
		malo.disminuirHP(d.getDaño());
		d.morir();
	}

	public void collideWith(DisparoEnemigo de) {}

	public void collideWith(Obstaculo o) {}

	public void collideWith(Premio p) {}

}
