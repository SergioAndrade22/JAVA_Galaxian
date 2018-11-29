package Disparo;

import grafica.DisparoLimitadoGrafica;
import mapa.Celda;

public class DisparoLimitado extends DisparoJugador {

	public DisparoLimitado(Celda c, int velocidad, int fuerza) {
		super( c, velocidad, fuerza);
		this.grafico = new DisparoLimitadoGrafica(velocidad, c.getX(), c.getY());
	}
}
