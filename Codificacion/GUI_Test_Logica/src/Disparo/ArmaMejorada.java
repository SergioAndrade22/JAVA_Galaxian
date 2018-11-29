package Disparo;

import personajes.Jugador;

public class ArmaMejorada extends ArmaJugador {

	public ArmaMejorada(Jugador j, int d) {
		super(j, d);
	}
	
	public Disparo createDisparo() {
		return new DisparoMejorado(jugador.getPos(), 50, daño);
	}

}
