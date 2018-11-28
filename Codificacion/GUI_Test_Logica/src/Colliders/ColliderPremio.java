package Colliders;

import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.Jugador;
import personajes.Malo;

public class ColliderPremio implements Collider {

	protected Premio premio;
	
	public ColliderPremio(Premio p) {
		premio=p;
	}

	public void collideWith(Jugador j) { /*NADA*/ }

	public void collideWith(Malo m) { /*NADA*/ }

	public void collideWith(DisparoJugador d) { /*NADA*/ }

	public void collideWith(DisparoEnemigo de) { /*NADA*/ }

	public void collideWith(Obstaculo o) { /*NADA*/ }

	public void collideWith(Premio p) { /*NADA*/ }
	
	public void collideWith(Barricada b) { /*NADA*/ }
}