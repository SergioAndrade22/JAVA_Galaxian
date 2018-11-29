package Disparo;

import personajes.Jugador;

public class ArmaMisil extends ArmaJugador{

	public ArmaMisil(Jugador j, int d){
		super(j, d);
	}
	
	public Disparo createDisparo() {
		return new DisparoMisil(jugador.getPos(), 50, daño);
	}
}