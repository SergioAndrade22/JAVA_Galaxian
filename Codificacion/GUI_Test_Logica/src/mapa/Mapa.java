package mapa;

import gui.GUI;
import personajes.Entidad;

public class Mapa {
	private Celda mapa[][];
	private int width, height;
	private GUI gui;
	//añadir un atributo FileOpener para poder abrir el archivo y leerlo, hay que ver bien como hacer funcionar esto

	public Mapa(GUI gui, int width, int height){ //habría que modificar esto para que según nuestra implementación el mapa reciba el int del nivel que tiene q crear
		this.gui = gui;
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
		int[] aux = checkDirections(x, y);
		x = aux[0];
		y = aux[1];
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
	
	//metodo auxiliar q verifica el valor correcto de las coordenadas
	private int[] checkDirections(int x, int y){
		if (x >= mapa.length)
			x = this.width-1;
		if (x < 0)
			x = this.width-1;
		if (y >= mapa[0].length)
			y = 0;
		if (y < 0)
			y = this.height-1;
		int[] aux = new int[2];
		aux[0] = x;
		aux[1] = y;						
		return aux;
	}
	
	public void remove(Entidad e) {
		gui.remove(e.getGrafico());
	}
}