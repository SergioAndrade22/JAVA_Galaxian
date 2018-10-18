package personajes;
import mapa.*;

public abstract class Personajes extends Entidad {
	
	protected int fuerza_kamikaze;
	
	public Personajes(Celda c){
		super(c);
		velocidad=10;
	}

	public abstract Disparo disparar();
}