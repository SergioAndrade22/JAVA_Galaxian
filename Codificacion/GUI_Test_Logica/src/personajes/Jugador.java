package personajes;

import java.awt.event.KeyEvent;
import grafica.JugadorGrafico;
import juego.Juego;
import mapa.Celda;
import Colliders.*;
import Disparo.Arma;
import Disparo.ArmaJugador;
import Disparo.ArmaMisil;
import Disparo.Disparo;

public class Jugador extends Personaje{
	protected boolean escudo;
	protected Arma arma;
	protected final int  hp_max=100;
	protected Juego juego;
	protected Arma provisoria;
		
	public Jugador(Celda pos, Juego j) {
		super(pos);
		this.grafico = new JugadorGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider = new ColliderJugador(this);
		hp=100;
		fuerza_kamikaze=50;
		escudo=false;
		arma=new ArmaJugador(this,10);
		juego = j;
	}

	public void mover(int dir){
		switch (dir){
		case KeyEvent.VK_UP : //Arriba
			super.mover(KeyEvent.VK_UP);
			break;
		case KeyEvent.VK_DOWN : //Abajo
			super.mover(KeyEvent.VK_DOWN);
			break;
		}
		
	}

	public void mover() {}
	
	public Disparo disparar() {
		Disparo d = arma.createDisparo();
		pos.addEntidad(d);
		return d;
	}
	
	public void colision(Entidad e) {
		e.aceptar(collider);
		
	}
	
	public void aceptar(Collider c) {
		c.collideWith(this);
	}

	public void disminuirHP(int i) {
		hp-=i;		
		if(hp==0) {
			juego.loss();
			System.out.printf("El jugador murio.");
		}
	}
	
	public void aumentarHP(int i) {
		hp+=i;
	}

	public void setEscudo(boolean b) {
		escudo=b;
	}

	public void recibirGolpe() {
		if(escudo)
			escudo=false;
		else 
			disminuirHP(10);
		
	}
	
	public void completarHP() {
		hp=hp_max;
	}
	
	public Arma getArma() {
		return arma;
	}
	public void enableMisil() {
		provisoria=arma;
		arma=new ArmaMisil(this,100);
	}
	public void disableMisil() {
		arma=provisoria;
	}
	public void congelar() {
		juego.congelar();
	}
	
	public void descongelar() {
		juego.descongelar();
	}
}