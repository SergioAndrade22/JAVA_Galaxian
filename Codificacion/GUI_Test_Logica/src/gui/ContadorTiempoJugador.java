package gui;

import juego.Juego;

public class ContadorTiempoJugador extends Thread {
	private Juego juego;
	private GUI gui;
	private volatile boolean runing = true;

	ContadorTiempoJugador(Juego j, GUI gui) {
		this.juego = j;
		this.gui = gui;
	}

	public void run() {
		while(runing){
			try {
				Thread.sleep((long) 0.50);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(gui.getLock()){
				juego.mover(gui.getDirection());
				gui.toggleLock();
			}
		}
	}
	
	public void detener() {
		runing = false;
	}
}
