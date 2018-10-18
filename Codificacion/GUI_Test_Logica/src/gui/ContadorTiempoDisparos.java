package gui;

import juego.Juego;

public class ContadorTiempoDisparos extends Thread {
	private Juego juego;

	ContadorTiempoDisparos(Juego j) {
		this.juego = j;
	}

	public void run() {
		while(true){
			juego.moverDisparos();
		}
	}
}
