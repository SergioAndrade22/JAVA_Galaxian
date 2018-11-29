package Disparo;

import personajes.Jugador;

public class ArmaComun extends ArmaJugador {

	public ArmaComun(Jugador j, int d) {
		super(j, d);
	}
	
	public Disparo createDisparo() {
		return new DisparoComun(jugador.getPos(), 50, daño);
	}
}
