package personajes;

import java.awt.event.KeyEvent;

public class ArmaJugador {
	
	protected int daño;
	protected Jugador jugador;

	public ArmaJugador(Jugador j, int d){
		daño=d;
		jugador=j;
	}
	public Disparo createDisparo() {
		return new DisparoJugador(jugador.getPos().getVecina(KeyEvent.VK_RIGHT), 50, daño);
	}
	
	public void aumentarDaño(int i) {
		daño=+i;
	}
	public int getDaño() {
		return daño;
	}
}
