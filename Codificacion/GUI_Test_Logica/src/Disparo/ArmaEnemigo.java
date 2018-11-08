package Disparo;

import mapa.Celda;
import personajes.Malo;

public class ArmaEnemigo {

	protected int daño;
	protected Malo malo;
	
	public ArmaEnemigo(Malo m, int d) {
		malo=m;
		daño=d;
	}
	public Disparo createDisparo() {
		return new DisparoEnemigo(malo.getPos().getVecina(Celda.LEFT),10,daño);
	}

}
