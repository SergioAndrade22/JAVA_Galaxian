package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;

public class ColliderMalo implements Collider {

	public ColliderMalo() {
	}

	public void collideWith(Jugador j) {
		j.disminuirHP(10);

	}

	public void collideWith(Malo m) {}

	@Override
	public void collideWith(DisparoJugador d) {
		d.morir();
	}

	@Override
	public void collideWith(DisparoEnemigo de) {}

	@Override
	public void collideWith(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collideWith(Premio p) {
		// TODO Auto-generated method stub
		
	}

}
