package Objetos;

import mapa.Celda;
import personajes.*;

public abstract class Premio extends EntidadMovimiento { //Sirve para diferenciar de los obstaculos y barricadas. Tal vez podriamos borrarlo y
												// dejar magia temporal y objeto precioso extendiendo de Objeto.
												//Premio podría ser un paquete.
	
	public Premio(Celda c){
		super(c);
	}
	
	public Premio(Celda c, int hp){
		super(c,hp);
	}

}
