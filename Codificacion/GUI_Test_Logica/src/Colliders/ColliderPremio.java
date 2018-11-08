package Colliders;

import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.Jugador;
import personajes.Malo;

public class ColliderPremio implements Collider {

	protected Premio premio;
	
	public ColliderPremio(Premio p) {
		premio=p;
	}

	@Override
	public void collideWith(Jugador j) {
		premio.actuar(j);
		premio.morir();
	}

	public void collideWith(Malo m) {}

	public void collideWith(DisparoJugador d) {}

	public void collideWith(DisparoEnemigo de) {}

	public void collideWith(Obstaculo o) {}

	public void collideWith(Premio p) {}

}
