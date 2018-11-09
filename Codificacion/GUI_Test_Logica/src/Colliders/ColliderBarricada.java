package Colliders;

import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.Jugador;
import personajes.Malo;

public class ColliderBarricada implements Collider {
	private Barricada bar;
	
	public ColliderBarricada(Barricada b) {
		bar = b;
	}

	public void collideWith(DisparoJugador d) {
		bar.recibirDaño(25);
		d.morir();
	}
	
	public void collideWith(Jugador j) { /*NADA*/ }

	public void collideWith(Malo m) { /*NADA*/ }

	public void collideWith(Premio p) { /*NADA*/ }

	public void collideWith(Obstaculo o) { /*NADA*/ }
	
	public void collideWith(Barricada b) { /*NADA*/ }

	public void collideWith(DisparoEnemigo d) { /*NADA*/ }
}