package Disparo;

import personajes.Jugador;

public class ArmaJugador extends Arma{
	
	protected int daño;
	protected Jugador jugador;

	public ArmaJugador(Jugador j, int d){
		daño=d;
		jugador=j;
	}
	
	public Disparo createDisparo() {
		return new DisparoJugador(jugador.getPos(), 50, daño);
	}
	
	public void aumentarDaño(int i) {
		daño=+i;
	}
	
	public int getDaño() {
		return daño;
	}
}
