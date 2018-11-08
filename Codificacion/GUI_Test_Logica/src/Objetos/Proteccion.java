package Objetos;

import mapa.Celda;
import personajes.Jugador;

public class Proteccion extends Premio{

	public Proteccion() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mover() {
		super.mover(Celda.LEFT);
		
	}
	public void actuar(Jugador j) {
		j.setEscudo(true);
	}

}
