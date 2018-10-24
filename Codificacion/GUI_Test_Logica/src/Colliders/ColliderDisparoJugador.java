package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.*;
public class ColliderDisparoJugador implements Collider {

	public ColliderDisparoJugador() {
		// TODO Auto-generated constructor stub
	}

	public void collideWith(Jugador j) {}

	public void collideWith(Malo m) {
		m.morir();
	}
	public void collideWith(DisparoJugador d) {}

	
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
