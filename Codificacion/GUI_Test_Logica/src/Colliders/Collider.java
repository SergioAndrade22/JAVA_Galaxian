package Colliders;

import personajes.*;

public interface Collider {

	public void collideWith(Jugador j);
	public void collideWith(Malo m);
	//public void collideWith(Premio p); ->Acomodarr

}
