package personajes;

import java.io.BufferedInputStream;
import java.io.InputStream;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;

import grafica.DisparoGrafico;
import mapa.Celda;

public abstract class Disparo extends Entidad{
	protected int dir;
	
	public Disparo(Celda c, int velocidad, int fuerza){
		super(c,velocidad);
		this.grafico = new DisparoGrafico(velocidad, this.pos.getX(), this.pos.getY());
		dir = -1;
		
	}
	
	public void mover() {
		super.mover(dir);
	}
	public void morir() {
		pos.eliminarDisparo(this);
	}
	
}