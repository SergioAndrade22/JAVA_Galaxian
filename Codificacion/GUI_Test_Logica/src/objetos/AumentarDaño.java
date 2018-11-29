package objetos;

import disparo.ArmaMejorada;
import personajes.Jugador;

public class AumentarDaño extends Premio{

	public AumentarDaño() {
		super();
	}

	public void actuar(Jugador jugador) {
		System.out.println("Activado Mejora Arma");
		jugador.setArma(new ArmaMejorada(jugador, (jugador.getArma().getDaño() + 20)));
	}
}