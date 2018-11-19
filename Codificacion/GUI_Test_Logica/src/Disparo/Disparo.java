package Disparo;

import grafica.DisparoGrafico;
import mapa.Celda;
import personajes.Entidad;

public abstract class Disparo extends Entidad{
	protected int dir;
	protected int daño;
	
	public Disparo(Celda c, int velocidad, int daño){
		super(c,velocidad);
		this.grafico = new DisparoGrafico(velocidad, c.getX(), c.getY());
		dir = -1;
		this.daño=daño;
		
	}
	
	/*public void mover(int dir) {
		super.mover(dir);
		this.pos.removeEntidad(this);
		this.pos =  this.pos.getVecina(dir);
		this.grafico.mover(dir);
		pos.addEntidad(this);
	}*/
	/*public void morir() {
		pos.eliminarEntidad(this);
	}*/
	
	public int getDaño() {
		return daño;
	}
}