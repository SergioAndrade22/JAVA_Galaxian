package personajes;

import mapa.Celda;

public class Arma {

	protected int daño;
	protected Malo malo;
	
	public Arma(Malo m, int d) {
		malo=m;
		daño=d;
	}
	public Disparo createDisparo() {
		return new DisparoEnemigo(malo.getPos().getVecina(Celda.LEFT),daño,10);
	}

}
