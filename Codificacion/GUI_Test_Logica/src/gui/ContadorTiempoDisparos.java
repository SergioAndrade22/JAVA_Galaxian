package gui;

import juego.Juego;

public class ContadorTiempoDisparos extends Thread {
	private Juego juego;
	private volatile boolean paused;

	ContadorTiempoDisparos(Juego j) {
		this.juego = j;
	}

	public void run() {
		paused = false;
		while(true) {
			if (paused) {}
			else {
				try {
					juego.moverDisparos();
					Thread.sleep((long)50);
				}
				catch(InterruptedException ex) {
					ex.printStackTrace();
				}
			}
		}
	}
	
	public void pause() {
		paused = true;
	}
	
	public void restart() {
		paused = false;
	}
}
