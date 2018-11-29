package Disparo;


public abstract class Arma {

	protected int daño;
	
	public Arma() {
		
	}
	
	public abstract Disparo createDisparo() ;
	
	public int getDaño() {
		return daño;
	}
}
