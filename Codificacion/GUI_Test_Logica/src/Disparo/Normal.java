package Disparo;

import mapa.Celda;

public class Normal extends State{

	public Normal(DisparoEnemigo d) {
		super(d);
	}
	
	public void mover() {
		if (disparo.getPos().isStartX())
			disparo.morir();
		else
			disparo.mover(Celda.LEFT);
	}
}
