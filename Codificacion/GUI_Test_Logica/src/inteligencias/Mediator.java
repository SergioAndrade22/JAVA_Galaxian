package inteligencias;

import Disparo.Disparo;
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
	
	public static Mediator getInstance() {
		return (instance == null) ? instance = new Mediator() : instance;
	}
	
	public int getPosJY() {
		return jugador.getPos().getY();
	}
	
	public void agregarDisparo(Disparo d) {
		juego.agregarDisparo(d);
	}
	
	public void insertarPremio(Celda c) {
		juego.insertarPremio(c);
	}
	
	public void scoreUp() {
		juego.scoreUp();
	}
}