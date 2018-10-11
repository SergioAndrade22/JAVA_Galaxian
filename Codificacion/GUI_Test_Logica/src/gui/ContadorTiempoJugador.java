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
				Thread.sleep((long) 0.25);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(gui.getLock()){
				juego.mover(gui.getDirection());
				juego.moverd(gui.getDirection());
				gui.toggleLock();
			}
		}
	}
}
