package personajes;

import juego.Juego;
import mapa.Celda;

public class Mediator {
	private Jugador jugador;
	private Juego juego;
	
	public Mediator(Jugador j,Juego juego) {
		jugador = j;
		this.juego=juego;
	}
	
	public Mediator() {

	}
	
	public void setJugador(Jugador j) {
		jugador = j;
	}
	
	public Celda getPosJ() {
		return jugador.getPos();
	}
	public Juego getJuego() {
		return juego;
	}
}