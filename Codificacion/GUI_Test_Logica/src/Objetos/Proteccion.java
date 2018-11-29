package Objetos;

import mapa.Celda;
import personajes.Jugador;

public class Proteccion extends Premio{

	public Proteccion(Celda c) {
		super(c);
	}
	
	public Proteccion() {
		super();
		
	}

	public void actuar(Jugador j) {
		System.out.println("Activado Proteccion");
		j.setEscudo(true);
	}

}
