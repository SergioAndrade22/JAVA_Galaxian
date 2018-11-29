package Disparo;

import grafica.DisparoMisilGrafica;
import mapa.Celda;

public class DisparoMisil extends DisparoJugador {

	public DisparoMisil(Celda c, int velocidad, int fuerza) {
		super(c, velocidad, fuerza);
		this.grafico = new DisparoMisilGrafica(velocidad, c.getX(), c.getY());
	}
}
