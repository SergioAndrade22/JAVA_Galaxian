package personajes;

import mapa.Celda;

public abstract class EntidadMovimiento extends Entidad{
	
	protected int velocidad;
	protected int fuerza_kamikaze;
	
	public EntidadMovimiento(Celda c){
		super(c);
	}
	
	public EntidadMovimiento(Celda c, int velocidad){
		super(c);
		this.velocidad=velocidad;
	}
	
	public void mover(int dir){
		Celda next = this.pos.getVecina(dir);
		if(next != null){
			this.pos = next;
			this.grafico.mover(dir);
		}
	}

}
