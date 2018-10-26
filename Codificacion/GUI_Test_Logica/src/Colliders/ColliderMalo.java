package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;

public class ColliderMalo implements Collider {

	protected Malo malo;
	public ColliderMalo(Malo m) {
		malo=m;
	}

	public void collideWith(Jugador j) {
		j.disminuirHP(10);
		//malo.morir();
	}

	public void collideWith(Malo m) {}

	@Override
	public void collideWith(DisparoJugador d) {
		d.morir();
		malo.disminuirHP(10);
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
