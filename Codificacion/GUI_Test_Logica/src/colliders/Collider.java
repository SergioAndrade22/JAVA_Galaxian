package colliders;

import personajes.*;
import disparo.DisparoEnemigo;
import disparo.DisparoJugador;
import objetos.*;

public interface Collider {

	public void collideWith(Jugador j);
	public void collideWith(Malo m);
	public void collideWith(Premio p); 
	public void collideWith(DisparoJugador d);
	public void collideWith(DisparoEnemigo de);
	public void collideWith(Obstaculo o);
	public void collideWith(Barricada b);
}

