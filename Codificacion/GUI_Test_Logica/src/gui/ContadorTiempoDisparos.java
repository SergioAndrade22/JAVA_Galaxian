package gui;

import juego.Juego;

public class ContadorTiempoDisparos extends Thread {
	private Juego juego;
	private boolean paused = false;
	private final Object pauseLock = new Object();

	ContadorTiempoDisparos(Juego j) {
		this.juego = j;
	}

	public void run() {
		while(true) {
			synchronized(pauseLock) {
				if (paused) {
					try {
						pauseLock.wait();
					}
					catch (InterruptedException ex) {
						ex.printStackTrace();
					}
				}
				else {
					try {
						juego.moverDisparos();
						Thread.sleep((long)0.25);
					}
					catch(InterruptedException ex) {
						ex.printStackTrace();
					}
				}
			}
		}
	}
	
	public void pause() {
		paused = true;
	}
	
	public void restart() {
		synchronized(pauseLock) {
			paused = false;
			pauseLock.notifyAll();
		}
	}
}
