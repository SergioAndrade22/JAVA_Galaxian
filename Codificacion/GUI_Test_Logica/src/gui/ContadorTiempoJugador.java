package gui;

import juego.Juego;

public class ContadorTiempoJugador extends Thread {
	private Juego juego;
	private GUI gui;

	ContadorTiempoJugador(Juego j, GUI gui) {
		this.juego = j;
		this.gui = gui;
	}

	public void run() {
		while(true){
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
}
