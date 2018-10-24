package Colliders;

import personajes.*;
import Objetos.*;

public interface Collider {

	public void collideWith(Jugador j);
	public void collideWith(Malo m);
	public void collideWith(Premio p); 
	public void collideWith(DisparoJugador d);
	public void collideWith(DisparoEnemigo de);
	public void collideWith(Obstaculo o);
}

