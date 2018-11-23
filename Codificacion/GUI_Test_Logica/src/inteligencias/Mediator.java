package inteligencias;

import juego.Juego;
import mapa.Celda;
import personajes.Jugador;

public class Mediator {
	private Jugador jugador;
	private Juego juego;
	private static Mediator instance = null;
	
	private Mediator() {
		
	}
	
	public void setJugador(Jugador j) {
		jugador = j;
	}
	
	public void setJuego(Juego j) {
		juego = j;
	}
	
	public Celda getPosJ() {
		return jugador.getPos();
	}
	public Juego getJuego() {
		return juego;
	}
	
	public static Mediator getInstance() {
		return (instance == null) ? instance = new Mediator() : instance;
	}
}