package personajes;
import mapa.*;

import java.util.Random;

import grafica.*;

public class Disparo extends EntidadMovimiento{
	
	public Disparo(Celda c, int velocidad, int fuerza){
		super(c,velocidad);
		fuerza_kamikaze=5;
		this.grafico = new DisparoGrafico(velocidad, this.pos.getX(), this.pos.getY());
	}
	
	public void mover() {
		int direccion = -1;
		direccion = Celda.RIGHT;
		this.pos.removeEntidad(this);
		super.mover(direccion);
		this.pos.addEntidad(this);
	}
	
	
	

}
