package disparo;

import mapa.Celda;
import grafica.DisparoComunGrafica;

public class DisparoComun extends DisparoJugador {

	public DisparoComun(Celda c, int velocidad, int fuerza) {
		super(c, velocidad, fuerza);
		this.grafico = new DisparoComunGrafica(velocidad, c.getX(), c.getY());
	}
}
