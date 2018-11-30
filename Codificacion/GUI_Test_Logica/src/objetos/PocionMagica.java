package objetos;

import personajes.Jugador;

public class PocionMagica extends Premio{

	public PocionMagica() {
		super();
	}
	
	public void actuar(Jugador jug) {
		jug.completarHP();
	}
}