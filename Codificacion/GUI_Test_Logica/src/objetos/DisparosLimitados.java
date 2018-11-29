package objetos;

import disparo.ArmaLimitada;
import personajes.Jugador;

public class DisparosLimitados extends Premio {
	
	public DisparosLimitados() {
		super();
	}

	@Override
	public void actuar(Jugador jugador) {
		System.out.println("Activado mejora arma");
		ArmaLimitada a=new ArmaLimitada(jugador, 100);
		a.setProvisoria(jugador.getArma());
		jugador.setArma(a);
	}
}
