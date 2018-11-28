package gui;

import juego.Juego;

public class ContadorTiempoEntidades extends Thread {
	private Juego juego;
	private volatile boolean runing = true;

	ContadorTiempoEntidades(Juego j) {
		this.juego = j;
	}

	public void run() {
		while(runing) {
			try {
				juego.moverEntidades();
				Thread.sleep((long)700);
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void detener() {
		runing = false;
	}
}