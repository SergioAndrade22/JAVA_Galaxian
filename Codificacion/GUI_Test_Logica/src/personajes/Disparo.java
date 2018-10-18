package personajes;

import grafica.DisparoGrafico;
import mapa.Celda;

public abstract class Disparo extends Entidad{
	protected int dir;
	
	public Disparo(Celda c, int velocidad, int fuerza){
		super(c,velocidad);
		this.grafico = new DisparoGrafico(velocidad, this.pos.getX(), this.pos.getY());
		dir = -1;
	}
	
	public void mover() {
		super.mover(dir);
	}
}