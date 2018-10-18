package juego;
import java.util.ArrayList;

import java.util.Random;
import gui.GUI;
import mapa.Celda;
import mapa.Mapa;
import personajes.*;

public class Juego {
	private Jugador jugador;
	private Malo malos[];
	private int cantMalos = 3; //remover
	private Mapa mapa;
	private int tamanioCelda = 50;
	private GUI gui;
	private Score score;
	private ArrayList<Disparo> disparos;
	
	public Juego(GUI gui){
		this.mapa = new Mapa(gui, gui.getWidth()/tamanioCelda, gui.getHeight()/tamanioCelda); //hay que modificarlo para poder hacerlo con el archivo
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c);
		disparos= new ArrayList<Disparo>();
		score = new Score();
		this.gui = gui;
		this.gui.add(jugador.getGrafico());
		this.malos = new Malo[this.cantMalos];
		//agregarDisparo();
		Random r = new Random();
		Malo m;
		for(int i = 0; i < this.cantMalos; i++){
			int x = r.nextInt(this.mapa.getWidth());
			int y = r.nextInt(this.mapa.getHeight());
			c = this.mapa.getCelda(x+1, y+1);
			m = new Malo(c);
			this.malos[i] = m;
			c.addEntidad(m);
			this.gui.add(m.getGrafico());
		}
		gui.add(score);
	}
	
	public void removeEnemies() {
		for(int i = 0; i < malos.length; i++) {
			if(malos[i]!=null) {
				malos[i].morir();
			}
		}
	}
	
	public void moverEnemigos(){
		for(Malo en : malos){
				en.mover();
				Disparo d = en.disparar();
				gui.addDisparo(d);
		}
	}
	
	public void moverDisparos() {
		for (Disparo d : disparos) {
			d.mover();
			gui.getContentPane().repaint();
			gui.getContentPane().revalidate();
		}
	}
	
	public void mover(int dir){
		jugador.mover(dir);
	}
	
	public void disparoJugador(){
		Disparo d = jugador.disparar();
		disparos.add(d);
		gui.addDisparo(d);
	}
}