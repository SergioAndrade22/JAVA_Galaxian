package juego;

import java.util.ArrayList;

import Objetos.Barricada;
import gui.GUI;
import mapa.Celda;
import mapa.Mapa;
import mapa.Nivel;
import mapa.NivelUnico;
import personajes.*;

public class Juego {
	private Jugador jugador;
	private ArrayList<Malo> malos;
	private ArrayList<Disparo> disparos;
	private ArrayList<Barricada> obst;
	private Mapa mapa;
	private int tamanioCelda = 50;
	private GUI gui;
	private Score score;
	private Nivel nivel;
	
	public Juego(GUI gui){
		mapa = new Mapa(gui, gui.getWidth()/tamanioCelda, gui.getHeight()/tamanioCelda); //hay que modificarlo para poder hacerlo con el archivo
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c);
		disparos = new ArrayList<Disparo>();
		malos = new ArrayList<Malo>();
		obst = new ArrayList<Barricada>();
		score = new Score();
		nivel = new NivelUnico();
		nivel.createEnemies();
		malos = nivel.getEnemies();
		nivel.createObjects();
		obst = nivel.getObjects();
		mapa.place(malos);
		mapa.placeB(obst);
		this.gui = gui;
		this.gui.add(jugador.getGrafico());
		gui.add(score);
	}
	
	public void moverEnemigos(){
		for(Malo en : malos){
				en.mover();
				/*
				gui.stopDisparos();
				Disparo d = en.disparar();
				disparos.add(d);
				gui.addDisparo(d);
				gui.restartDisparos();
				*/
		}
	}
	
	public void moverDisparos() {
		for (Disparo d : disparos) {
			gui.stopDisparos();
			d.mover();
			gui.restartDisparos();
		}
	}
	
	public void mover(int dir){
		jugador.mover(dir);
	}
	
	public void disparoJugador(){
		Disparo d = jugador.disparar();
		gui.stopDisparos();
		disparos.add(d);
		gui.addDisparo(d);
		gui.restartDisparos();
	}
}