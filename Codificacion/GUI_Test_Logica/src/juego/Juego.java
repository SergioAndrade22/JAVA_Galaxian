package juego;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import disparo.Disparo;
import gui.GUI;
import inteligencias.Mediator;
import mapa.*;
import niveles.Nivel;
import niveles.NivelInicial;
import objetos.Objeto;
import objetos.Premio;
import personajes.*;

public class Juego {
	private Jugador jugador;
	private List<Entidad> entidades;
	private Mapa mapa;
	private int tamanioCelda = 50;
	private GUI gui;
	private Score score;
	private Nivel nivel;
	private int maxScore;
	
	public Juego(GUI gui){
		this.gui = gui;
		nivel = new NivelInicial(6);
		crearNivel();		
	}
	
	private void crearNivel() {
		mapa = new Mapa((gui.getWidth()/tamanioCelda)-1, (gui.getHeight()/tamanioCelda)-1); 
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c);
		this.gui.addItem(jugador.getGrafico());
		Mediator med = Mediator.getInstance();
		med.setJugador(jugador);
		med.setJuego(this);
		entidades = new CopyOnWriteArrayList<Entidad>();
		nivel.createEnemies();
		for (Entidad en : nivel.getEnemies()) 
			entidades.add(en);
		mapa.orderPlace(entidades);
		for (Entidad en : entidades)
			this.gui.addItem(en.getGrafico());
		nivel.createBarricadas();
		nivel.createObstaculos();
		List<Objeto> aux = nivel.getObjetos();
		mapa.randomPlace(aux);
		entidades.addAll(aux);
		for (Objeto o: aux) 
			this.gui.addItem(o.getGrafico());
		score = new Score();
		maxScore = nivel.getCant() * 100;
		this.gui.addItem(score);
		this.gui.addItem(jugador.getVida());
		this.gui.addItem(jugador.getGrafico());
	}
	
	public void moverEntidades(){
		synchronized(entidades) {
			for(Entidad en : entidades) 
				en.mover();
		}
	}
	
	public void mover(int dir){
		synchronized(jugador){
			jugador.mover(dir);
		}
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
	public void insertarPremio(Celda c) {
		synchronized (entidades) {
			Premio p=nivel.getPremio();
			entidades.add(p);
			p.setPos(c);
			gui.addItem(p.getGrafico());
		}
	}
	
	public void agregarDisparo(Disparo d) {
		entidades.add(d);
		gui.addItem(d.getGrafico());
	}
	
	public void loss() {
		gui.gameOver();
	}
	
	public void congelar() {
		synchronized(entidades) {
			for (Entidad a:entidades) 
				a.congelar();
		}
	}
	
	public void descongelar() {
		synchronized(entidades) {
			for(Entidad a:entidades)
				a.descongelar();	
		}
	}
	
	public void scoreUp() {
		score.increase(100);
		if (score.getTotal() == maxScore)
			gui.nextLevel();
	}
	
	public boolean hasNextLevel() {
		return nivel.getSiguiente() != null;
	}
	
	public void playNext() {
		nivel = nivel.getSiguiente();
		crearNivel();
	}
}