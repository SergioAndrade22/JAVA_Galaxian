package personajes;

import java.util.Random;
import mapa.*;

public abstract class Personaje extends Entidad {

	protected int fuerza_kamikaze;

	public Personaje(Celda c) {
		super(c);
		velocidad = 10;
	}

	public Personaje() {
		velocidad = 10;
	}

	public void mover(int dir) {
		synchronized (pos) {
			this.pos.removeEntidad(this);
			Celda next = this.pos.getVecina(dir);
			this.pos = next;
			pos.addEntidad(this);
			this.grafico.mover(dir);
		}
	}
}