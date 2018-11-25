package Objetos;

import mapa.Celda;
import personajes.Jugador;

public class MejoraArma extends Premio{

	public MejoraArma(Celda c) {
		super(c);
	}
	public MejoraArma() {
		super();
	}

	public void actuar(Jugador jugador) {
		System.out.println("Activado Mejora Arma");
		jugador.getArma().aumentarDaño(20);
	}
}