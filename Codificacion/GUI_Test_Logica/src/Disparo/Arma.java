package Disparo;


public abstract class Arma {

	public Arma() {
		
	}
	
	public abstract Disparo createDisparo() ;

	public abstract void aumentarDaño(int i) ;
}
