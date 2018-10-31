package personajes;

import mapa.Celda;

public class Mediator {
	private Jugador jugador;
	
	public Mediator(Jugador j) {
		jugador = j;
	}
	
	public Mediator() {

	}
	
	public void setJugador(Jugador j) {
		jugador = j;
	}
	
	public Celda getPosJ() {
		return jugador.getPos();
	}
}