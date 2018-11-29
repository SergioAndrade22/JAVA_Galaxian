package objetos;

import colliders.ColliderPremio;
import mapa.Celda;
import personajes.Jugador;

public abstract class Objeto_precioso extends Premio {
	
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
	
	public abstract void actuar(Jugador j);
}