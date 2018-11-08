package Objetos;

import personajes.Jugador;

public class Proteccion extends Premio{

	public Proteccion() {
		super();
	}

	public void actuar(Jugador j) {
		j.setEscudo(true);
	}

}
