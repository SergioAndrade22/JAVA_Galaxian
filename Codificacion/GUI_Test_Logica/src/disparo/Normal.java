package disparo;

import inteligencias.Mediator;
import mapa.Celda;

public class Normal extends State{

	public Normal(DisparoEnemigo d) {
		super(d);
	}
	
	public void mover() {
		if (disparo.getPos().isStartX()) {
			Mediator.getInstance().removerEntidad(disparo);
		}
		else {
			disparo.mover(Celda.LEFT);
			if (disparo.getPos().isStartX())
				disparo.morir();
		}
	}
}