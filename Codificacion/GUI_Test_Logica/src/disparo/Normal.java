package disparo;

import java.util.ArrayList;
import java.util.List;

import inteligencias.Mediator;
import mapa.Celda;
import personajes.Entidad;

public class Normal extends State{

	public Normal(DisparoEnemigo d) {
		super(d);
	}
	
	public void mover() {
		if (disparo.getPos().isStartX()) {
			List<Entidad> aux = new ArrayList<Entidad>();
			aux.add(disparo);
			Mediator.getInstance().removerEntidades(aux);
		}
		else
			disparo.mover(Celda.LEFT);
	}
}