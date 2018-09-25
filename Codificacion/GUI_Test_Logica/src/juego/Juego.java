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
	private int tamanioCelda = 50;
	private GUI gui;
	//añadir Puntaje, hay que crear la clase y relacionarla con la GUI haciendo un metodo para modificarlo y un campo para mostrarlo
	
	public Juego(GUI gui){
		this.mapa = new Mapa(gui.getWidth()/tamanioCelda, gui.getHeight()/tamanioCelda); //hay que modificarlo para poder hacerlo con el archivo
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c);
		this.gui = gui;
		this.gui.add(jugador.getGrafico());
		this.malos = new Malo[this.cantMalos];
		Random r = new Random();
		Malo m;
		for(int i = 0; i < this.cantMalos; i++){
			int x = r.nextInt(this.mapa.getWidth());
			int y = r.nextInt(this.mapa.getHeight());
			c = this.mapa.getCelda(x+1, y+1);
			m = new Malo(c);
			this.malos[i] = m;
			c.addMalo(m);
			this.gui.add(m.getGrafico());
		}
	}
	
	public void removeEnemies() {
		for(int i = 0; i < malos.length; i++) {
<<<<<<< HEAD
			if (malos[i] != null) {
=======
			if(malos[i]!=null) {
>>>>>>> origin/master
				gui.remove(malos[i].getGrafico());
				malos[i].getPos().removeMalo(malos[i]);
				malos[i] = null;
			}
		}
	}
	
	public void mover(){
		for(Malo en : malos){
				en.mover();
		}
	}
	
	public void mover(int dir){
		jugador.mover(dir);
	}
}