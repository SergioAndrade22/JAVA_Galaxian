package colliders;

import disparo.DisparoEnemigo;
import disparo.DisparoJugador;
import objetos.Barricada;
import objetos.Obstaculo;
import objetos.Premio;
import personajes.*;

public class ColliderMalo implements Collider {

	protected Malo malo;
	public ColliderMalo(Malo m) {
		malo=m;
	}

	public void collideWith(Jugador j) {
		j.recibirGolpe(malo.getGolpe());
	}

	public void collideWith(DisparoJugador d) {
		d.morir();
	}

	public void collideWith(Obstaculo o) { /*NADA*/	}
	
	public void collideWith(Barricada b) { /*NADA*/	}
	
	public void collideWith(Malo m) { /*NADA*/ }

	public void collideWith(DisparoEnemigo de) { /*NADA*/ }

	public void collideWith(Premio p) { /*NADA*/ }

}