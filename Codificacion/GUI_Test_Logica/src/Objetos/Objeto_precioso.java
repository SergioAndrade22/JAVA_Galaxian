package Objetos;

import Colliders.ColliderPremio;
import grafica.BonusGrafico;
import mapa.Celda;

public class Objeto_precioso extends Premio {
	
	public Objeto_precioso(Celda c){
		super(c);
	}
	
	public Objeto_precioso(Celda c, int hp){
		super(c,hp);
	}

	public Objeto_precioso() {
		collider=new ColliderPremio(this);
		this.grafico = new BonusGrafico(velocidad,0, 0);
		
	}

	@Override
	public void mover() {
		super.mover(Celda.LEFT);
		
	}
}
