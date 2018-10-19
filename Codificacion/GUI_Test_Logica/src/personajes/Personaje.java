package personajes;
import mapa.*;

public abstract class Personaje extends Entidad {
	
	protected int fuerza_kamikaze;
	
	public Personaje(Celda c){
		super(c);
		velocidad=10;
	}
	
	public Personaje() {
		velocidad = 10;
	}

	public abstract Disparo disparar();
}