package Disparo;

import personajes.Jugador;

public abstract class ArmaJugador extends Arma{
	
	protected int daño;
	protected Jugador jugador;

	public ArmaJugador(Jugador j, int d){
		daño=d;
		jugador=j;
	}
	
	public abstract Disparo createDisparo() ;
}
