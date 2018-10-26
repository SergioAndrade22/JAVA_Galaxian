package mapa;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import Objetos.Barricada;
import gui.GUI;
import juego.Juego;
import personajes.Disparo;
import personajes.Entidad;
import personajes.Malo;

public class Mapa {
	private Celda mapa[][];
	private int width, height;
	private Juego juego;
	//añadir un atributo FileOpener para poder abrir el archivo y leerlo, hay que ver bien como hacer funcionar esto

	public Mapa(Juego juego, int width, int height){ //habría que modificar esto para que según nuestra implementación el mapa reciba el int del nivel que tiene q crear
		this.juego = juego;
		this.width = width;
		this.height = height;
		this.mapa = new Celda[width][height];
		for(int i = 0; i < width; i++){
			for(int j = 0; j < height; j++){
				this.mapa[i][j] = new Celda(this, i, j);
			}
		}
	}
	
	public Celda getCelda(int x, int y){
		return this.mapa[x][y];
	}
	
	public Celda[][] getMapa() {
		return mapa;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public void remove(Entidad e) {
		juego.removerEntidad(e);
	}
	public void removeDisparo(Disparo d) {
		juego.removeDisparo(d);
	}
	
	public void removeMalo(Malo m) {
		juego.removeMalo(m);
	}
	
	public void place(List<Malo> l) {
		int i = 4;
		int j = this.getWidth()-1;
		for (Entidad m : l) {
			Celda c = getCelda(j, i++);
			m.setPos(c);
			c.addEntidad(m);
		}
	}
	
	public void placeB(ArrayList<Barricada> l) {
		Random r = new Random();
		for (Barricada b : l) {
			int x = r.nextInt(getWidth());
			int y = r.nextInt(getHeight());
			if (x == 0)
				x++;
			Celda c = getCelda(x, y);
			b.setPos(c);
			c.addEntidad(b);
			b.setGrafico();
			c.setObstaculo();
		}
	}
}