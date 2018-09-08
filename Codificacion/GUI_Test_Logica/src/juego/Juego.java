package juego;

import java.util.Random;
import gui.GUI;
import mapa.Celda;
import mapa.Mapa;
import personajes.Jugador;
import personajes.Malo;

public class Juego {
	private Jugador jugador;
	private Malo malos[];
	private int cantMalos = 3; //remover
	private Mapa mapa;
	private int tamanioCelda = 32;
	//a�adir Puntaje, hay que crear la clase y relacionarla con la GUI haciendo un metodo para modificarlo y un campo para mostrarlo
	
	public Juego(GUI gui){
		this.mapa = new Mapa((gui.getWidth() - 32) / this.tamanioCelda, (gui.getHeight() - 64 ) / this.tamanioCelda); //hay que modificarlo para poder hacerlo con el archivo
		Celda c = this.mapa.getCelda(0, 0);
		jugador = new Jugador(c);
		gui.add(jugador.getGrafico());
		this.malos = new Malo[this.cantMalos];
		Random r = new Random();
		Malo m;
		for(int i = 0; i < this.cantMalos; i++){
			int x = r.nextInt(this.mapa.getWidth());
			int y = r.nextInt(this.mapa.getHeight());
			c = this.mapa.getCelda(x, y);
			m = new Malo(c);
			this.malos[i] = m;
			c.addMalo(m);
			gui.add(m.getGrafico());
		}
	}
	
	public void mover(){
		for(int i = 0; i < malos.length; i++){
			malos[i].mover();
		}
	}
	
	public void mover(int dir){
		jugador.mover(dir);
	}
}