package disparo;

import java.util.ArrayList;
import java.util.List;

import colliders.*;
import inteligencias.Mediator;
import mapa.Celda;
import personajes.Entidad;

public class DisparoJugador extends Disparo{
	
	public DisparoJugador(Celda c, int velocidad, int fuerza){
		super(c,velocidad,5);
		collider=new ColliderDisparoJugador(this);
		dir = Celda.RIGHT;
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);
	}
	
	public void aceptar(Collider c) {
		c.collideWith(this);
	}
	
	public void mover() {
		if (pos.isEndX()) {
			List<Entidad> aux = new ArrayList<Entidad>();
			aux.add(this);
			Mediator.getInstance().removerEntidades(aux);
		}
		else
			super.mover(dir);
	}
	
	public void congelar() {}
	
	public void descongelar() {}
}