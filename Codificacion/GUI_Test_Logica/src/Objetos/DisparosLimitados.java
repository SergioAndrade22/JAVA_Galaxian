package Objetos;

import Disparo.ArmaLimitada;
import personajes.Jugador;

public class DisparosLimitados extends Premio {
	
	public DisparosLimitados() {
		super();
	}

	@Override
	public void actuar(Jugador jugador) {
		ArmaLimitada a=new ArmaLimitada(jugador, 100);
		a.setProvisoria(jugador.getArma());
		jugador.setArma(a);
	}
}
