package gui;

import juego.Juego;

public class ContadorTiempoEntidades extends Thread {
	private Juego juego;

	ContadorTiempoEntidades(Juego j) {
		this.juego = j;
	}

	public void run() {
		while(true) {
			try {
				juego.moverEntidades();
				Thread.sleep((long)100);
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
}