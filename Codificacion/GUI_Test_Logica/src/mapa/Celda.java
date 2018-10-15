package mapa;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

import personajes.Entidad;
import personajes.Jugador;
import personajes.Malo;

public class Celda {
	public static final int LEFT = KeyEvent.VK_LEFT;
	public static final int RIGHT = KeyEvent.VK_RIGHT;
	public static final int UP = KeyEvent.VK_UP;
	public static final int DOWN = KeyEvent.VK_DOWN;
	//private ArrayList<Malo> malos; COMENTO POR LAS DUDIS
	private ArrayList<Entidad> entidades;
	//private Jugador jugador;
	private Mapa mapa;
	private int x;
	private int y;
	//añadir una coleccion para los obstaculos
	
	public Celda(Mapa mapa, int x, int y){
		entidades=new ArrayList<Entidad>();
		//this.malos = new ArrayList<Malo>();
		//this.jugador = null;
		this.mapa = mapa;
		this.x = x;
		this.y = y;
	}
	
	public void addEntidad(Entidad e) {
		entidades.add(e);
		if(entidades.size()>1)
			for(Entidad a:entidades) {
				a.colision(e);
				e.colision(a);
			}
	}
	public void removeEntidad(Entidad e) {
		entidades.remove(e);
	}
	/*public void addMalo(Malo m){
		this.malos.add(m);
	}
	
	public void removeMalo(Malo m){
		this.malos.remove(m);
	}

	public Jugador getJugador() {
		return jugador;
	}

	public void setJugador(Jugador jugador) {
		this.jugador = jugador;
	}*/
	
	public Celda getVecina(int dir){
		switch (dir){
			case UP :
				if (--y >= 0)
					return this.mapa.getCelda(x, y);
				else {
					y = mapa.getHeight();
					return this.mapa.getCelda(x, y);
				}
			case DOWN :
				if (++y <= mapa.getHeight())
					return this.mapa.getCelda(x, y);
				else {
					y = 0;
					return this.mapa.getCelda(x, y);
				}
			case LEFT :
				return this.mapa.getCelda(x-1, y);
			case RIGHT :
				return this.mapa.getCelda(x+1, y);
		}
		return null;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}
