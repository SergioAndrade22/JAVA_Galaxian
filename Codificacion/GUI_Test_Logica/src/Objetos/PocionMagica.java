package Objetos;

import mapa.Celda;
import personajes.Jugador;

public class PocionMagica extends Premio{

	public PocionMagica(Celda c) {
		super(c);
	}
	
	public void actuar(Jugador jug) {
		jug.completarHP();
	}
	
	public void mover() {
		if (!pos.isStartX())
			super.mover(Celda.LEFT);
		else
			morir();
	}
}