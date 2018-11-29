package disparo;

import grafica.DisparoMejoradoGrafica;
import mapa.Celda;

public class DisparoMejorado extends DisparoJugador {

	public DisparoMejorado(Celda c, int velocidad, int fuerza) {
		super(c, velocidad, fuerza);
		this.grafico = new DisparoMejoradoGrafica(velocidad, c.getX(), c.getY());
	}
}
