package disparo;

import personajes.Jugador;

public class ArmaLimitada extends ArmaJugador{
	
	protected Arma provisoria;
	protected final int limite=10;
	protected int disparados;

	public ArmaLimitada(Jugador j, int d){
		super(j, d);
		disparados=0;
	}
	
	public Disparo createDisparo() {
		DisparoJugador a= new DisparoLimitado(jugador.getPos(), 50, daño);
		disparados++;
		if(disparados==limite)
			jugador.setArma(provisoria);
		return a;
	}
	
	public void setProvisoria(Arma arma) {
		provisoria=arma;		
	}
}