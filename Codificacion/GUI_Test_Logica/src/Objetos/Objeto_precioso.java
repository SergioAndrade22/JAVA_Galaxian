package Objetos;

import Colliders.ColliderPremio;
import grafica.BonusGrafico;
import mapa.Celda;
import personajes.Jugador;

public class Objeto_precioso extends Premio {
	
	public Objeto_precioso(Celda c){
		super(c);
		collider=new ColliderPremio(this);
		
	}
	
	public Objeto_precioso(Celda c, int hp){
		super(c,hp);
		collider=new ColliderPremio(this);
	}

	public Objeto_precioso() {
		super();
	}

	@Override
	
	public void actuar(Jugador j) {
	//	j.aumentarHP(10); //Provisorio
		
	}

	
}
