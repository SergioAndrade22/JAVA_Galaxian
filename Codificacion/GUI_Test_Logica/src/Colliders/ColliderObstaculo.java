package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.DisparoEnemigo;
import personajes.DisparoJugador;
import personajes.Jugador;
import personajes.Malo;

public class ColliderObstaculo implements Collider {

	public ColliderObstaculo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void collideWith(Jugador j) {
		
		
	}

	@Override
	public void collideWith(Malo m) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collideWith(DisparoJugador d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collideWith(DisparoEnemigo de) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collideWith(Obstaculo o) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void collideWith(Premio p) {
		// TODO Auto-generated method stub
		
	}

}
