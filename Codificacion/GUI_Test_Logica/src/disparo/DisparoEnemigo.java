package disparo;

import mapa.Celda;
import personajes.Entidad;
import colliders.*;
import grafica.DisparoEnemigoGrafico;

public class DisparoEnemigo extends Disparo{
	
	protected State miEstado;

	public DisparoEnemigo(Celda c, int velocidad, int daño){
		super(c,velocidad,daño);
		this.grafico=new DisparoEnemigoGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider=new ColliderDisparoEnemigo(this);
		dir = Celda.LEFT;
		miEstado=new Normal(this);
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);	
	}
	
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	
	public void mover() {
		miEstado.mover();
	}
	
	public void congelar() {
		miEstado=new Congelado(this);
	}
	
	public void descongelar() {
		miEstado=new Normal(this);
	}
	
}