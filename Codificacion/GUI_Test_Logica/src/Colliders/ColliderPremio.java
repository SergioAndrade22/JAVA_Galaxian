package Colliders;

import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.DisparoEnemigo;
import personajes.DisparoJugador;
import personajes.Jugador;
import personajes.Malo;

public class ColliderPremio implements Collider {

	protected Premio premio;
	
	public ColliderPremio(Premio p) {
		premio=p;
	}

	@Override
	public void collideWith(Jugador j) {
		j.aumentarHP(50);
		premio.morir();
		//Puede ser otra cosa, capaz tener un collider por bonus

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
