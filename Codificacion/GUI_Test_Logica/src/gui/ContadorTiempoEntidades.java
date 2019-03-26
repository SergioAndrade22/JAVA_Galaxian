package gui;

import juego.Juego;

public class ContadorTiempoEntidades extends Thread {
	private Juego juego;
	private volatile boolean running = true;

	ContadorTiempoEntidades(Juego j) {
		this.juego = j;
	}

	public void run() {
		while(running) {
			try {
				juego.moverEntidades();
				Thread.sleep((long)500);
			}
			catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void detener() {
		running = false;
	}
	
	public void reanudar() {
		running = true;
	}
}