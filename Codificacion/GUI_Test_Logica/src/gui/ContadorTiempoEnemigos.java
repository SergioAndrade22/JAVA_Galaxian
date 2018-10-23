package gui;

import juego.Juego;

public class ContadorTiempoEnemigos extends Thread {
	private Juego juego;

	ContadorTiempoEnemigos(Juego j) {
		this.juego = j;
	}

	public void run() {
		while(true) {
			try {
				juego.moverEnemigos();
				Thread.sleep((long)100);
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}