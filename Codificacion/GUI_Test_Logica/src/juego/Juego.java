package juego;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import Objetos.Barricada;
import gui.GUI;
import mapa.Celda;
import mapa.Mapa;
import mapa.Nivel;
import mapa.NivelUnico;
import personajes.*;

public class Juego {
	private Jugador jugador;
	private List<Entidad> entidades;
	private List<Barricada> obst;
	private Mapa mapa;
	private int tamanioCelda = 50;
	private GUI gui;
	private Score score;
	private Nivel nivel;
	
	public Juego(GUI gui){
		this.gui = gui;
		mapa = new Mapa(this, (gui.getWidth()/tamanioCelda)-1, (gui.getHeight()/tamanioCelda)-1); 
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c);
		this.gui.addItem(jugador.getGrafico());
		Mediator med = new Mediator(jugador);
		entidades = new CopyOnWriteArrayList<Entidad>();
		obst = new ArrayList<Barricada>();
		score = new Score();
		nivel = new NivelUnico();
		nivel.createEnemies(med);
		for (Entidad en : nivel.getEnemies()) {
			entidades.add(en);
		}
		mapa.place(entidades);
		for (Entidad en : entidades)
			this.gui.addItem(en.getGrafico());
		nivel.createObjects();
		obst = nivel.getObjects();
		mapa.placeB(obst);
		for (Barricada b : obst)
			this.gui.addItem(b.getGrafico());
		this.gui.addItem(score);
	}
	
	public void moverEntidades(){
		synchronized(entidades) {
			for(Entidad en : entidades)
					en.mover();
		}
	}
	
	public void mover(int dir){
		jugador.mover(dir);
	}
	
	public void removerEntidad(Entidad e) {
		synchronized (entidades) {
			entidades.remove(e);
			gui.remover(e.getGrafico());
		}
	}
	
	public void disparoJugador(){
		synchronized(entidades) {
			Disparo d = jugador.disparar();
			entidades.add(d);
			gui.addItem(d.getGrafico());
		}
	}	
}