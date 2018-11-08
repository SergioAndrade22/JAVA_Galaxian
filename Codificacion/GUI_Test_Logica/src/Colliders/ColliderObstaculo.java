package Colliders;

import Disparo.DisparoEnemigo;
import Disparo.DisparoJugador;
import Objetos.Obstaculo;
import Objetos.Premio;
import personajes.Jugador;
import personajes.Malo;

public class ColliderObstaculo implements Collider {
	
	protected Obstaculo obstaculo;

	public ColliderObstaculo(Obstaculo o) {
		obstaculo=o;
	}

	public void collideWith(Jugador j) {}

	public void collideWith(Malo m) {}

	public void collideWith(DisparoJugador d) {
		obstaculo.morir();
		System.out.println("Quitar obstaculo");
		d.morir();		
}

	public void collideWith(DisparoEnemigo d) {
		obstaculo.morir();
		System.out.println("Quitar obstaculo");
		d.morir();		
	}

	public void collideWith(Obstaculo o) {}
	
	public void collideWith(Premio p) {}

}
