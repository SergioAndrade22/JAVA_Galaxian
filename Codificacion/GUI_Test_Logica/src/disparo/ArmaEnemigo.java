package disparo;

import mapa.Celda;
import personajes.Malo;

public class ArmaEnemigo extends Arma{

	protected Malo malo;
	
	public ArmaEnemigo(Malo m, int d) {
		malo=m;
		da�o=d;
	}
	
	public Disparo createDisparo() {
		return new DisparoEnemigo(malo.getPos().getVecina(Celda.LEFT),10,da�o);
	}
}