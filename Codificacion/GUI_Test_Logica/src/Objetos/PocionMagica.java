package Objetos;

import personajes.Jugador;

public class PocionMagica extends Premio{

	public PocionMagica() {
		super();
	}
	public void actuar(Jugador jug) {
		jug.completarHP();
	}
	public void mover() {
		// TODO Auto-generated method stub
		
	}

}
