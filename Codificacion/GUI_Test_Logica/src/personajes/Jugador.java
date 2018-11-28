package personajes;

import java.awt.event.KeyEvent;
import grafica.JugadorGrafico;
import inteligencias.Mediator;
import juego.Vida;
import mapa.Celda;
import Colliders.*;
import Disparo.Arma;
import Disparo.ArmaJugador;
import Disparo.ArmaMisil;
import Disparo.Disparo;

public class Jugador extends Personaje{
	protected boolean escudo;
	protected Arma arma;
	protected Arma provisoria;
	protected State vida;
	protected Vida observer;
		
	public Jugador(Celda pos) {
		super(pos);
		this.grafico = new JugadorGrafico(velocidad, this.pos.getX(), this.pos.getY());
		collider = new ColliderJugador(this);
		hp=100;
		fuerza_kamikaze=50;
		escudo=false;
		arma=new ArmaJugador(this,10);
		vida=new VidaSinEscudo(this);
		observer = new Vida(this);
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
		vida.disminuirHP(i);
		observer.update();
	}
	
	public void completarHP() {
		vida.completarHP();
		observer.update();
	}

	public void setEscudo(boolean b) {
		if(b) {
			int v=vida.getVida();
			vida=new VidaConEscudo(this,v);
		}
		else {
			int v=vida.getVida();
			vida=new VidaSinEscudo(this,v);
		}
	}

	public void loss() {
		Mediator.getInstance().loss();
	}

	public Arma getArma() {
		return arma;
	}
	
	public Arma setArma(Arma a){
		Arma toRet=arma;
		arma=a;
		return toRet;
	}
	
	public void enableMisil() {
		provisoria=arma;
		arma=new ArmaMisil(this,100);
	}
	
	public void disableMisil() {
		arma=provisoria;
	}
	
	public void congelar() {
		Mediator.getInstance().congelar();
	}
	
	public void descongelar() {
		Mediator.getInstance().descongelar();
	}

	public Vida getVida() {
		return observer;
	}
	
	public int getHP() {
		return vida.getVida();
	}
	
	public void recibirGolpe(int i) {
		vida.recibirGolpe(i);
		observer.update();
	}
}