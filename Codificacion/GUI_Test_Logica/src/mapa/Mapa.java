package mapa;

import java.util.List;
import java.util.Random;

import inteligencias.Mediator;
import objetos.Objeto;
import personajes.Entidad;

public class Mapa {
	private Celda mapa[][];
	private int width, height;

	public Mapa(int width, int height){
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

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public void orderPlace(List<Entidad> l) {
		int i = 4;
		int j = this.getWidth()-1;
		Celda c;
		for (Entidad m : l) {
			if (i+1 < this.getHeight())
				c = getCelda(j, i++);
			else {
				c = getCelda(j, 0);
			}
			m.setPos(c);
			c.addEntidad(m);
		}
	}
	
	public void randomPlace(List<Objeto> l) {
		Random r = new Random();
		for (Objeto o : l) {
			int x = r.nextInt(getWidth());
			int y = r.nextInt(getHeight());
			if (x == 0)
				x++;
			Celda c = getCelda(x, y);
			o.setPos(c);
			c.addEntidad(o);
			o.setGrafico();
		}
	}
}