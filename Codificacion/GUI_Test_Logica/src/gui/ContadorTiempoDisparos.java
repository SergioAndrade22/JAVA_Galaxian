package gui;

import juego.Juego;

public class ContadorTiempoDisparos extends Thread {
	private Juego juego;
	private volatile boolean running;

	ContadorTiempoDisparos(Juego j) {
		this.juego = j;
	}

	public void run() {
		running = true;
		while(running) {
			try {
				juego.moverDisparos();
				Thread.sleep((long)50);
			}
			catch(InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}
	
	public void pause() {
		running = false;
	}
	
	public void restart() {
		running = true;
	}
}
