package colliders;

import disparo.DisparoEnemigo;
import disparo.DisparoJugador;
import objetos.Barricada;
import objetos.Obstaculo;
import objetos.Premio;
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