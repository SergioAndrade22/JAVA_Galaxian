package juego;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import Disparo.Disparo;
import Objetos.Barricada;
import Objetos.Congelar;
import Objetos.Obstaculo;
import Objetos.Premio;
import gui.GUI;
import inteligencias.Mediator;
import mapa.*;
import niveles.Nivel;
import niveles.NivelInicial;
import personajes.*;

public class Juego {
	private Jugador jugador;
	private List<Entidad> entidades;
	private List<Barricada> barricadas;
	private List<Obstaculo> obstaculos;
	private Mapa mapa;
	private int tamanioCelda = 50;
	private GUI gui;
	private Score score;
	private Nivel nivel;
	private Mediator med;
	private Vida vidaJugador;
	
	public Juego(GUI gui){
		this.gui = gui;
		mapa = new Mapa(this, (gui.getWidth()/tamanioCelda)-1, (gui.getHeight()/tamanioCelda)-1); 
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c, this);
		vidaJugador=new Vida(jugador);
		jugador.addObserver(vidaJugador);
		this.gui.addItem(jugador.getGrafico());
		med = Mediator.getInstance();
		med.setJugador(jugador);
		med.setJuego(this);
		entidades = new CopyOnWriteArrayList<Entidad>();
		score = new Score();
		nivel = new NivelInicial(6);
		
		nivel.createEnemies();
		for (Entidad en : nivel.getEnemies()) 
			entidades.add(en);
		mapa.place(entidades);
		for (Entidad en : entidades)
			this.gui.addItem(en.getGrafico());
		nivel.createBarricadas();
		nivel.createObstaculos();
		barricadas = nivel.getBarricadas();
		obstaculos = nivel.getObstaculos();
		mapa.placeB(barricadas);
		mapa.placeO(obstaculos);
		for (Barricada b : barricadas)
			this.gui.addItem(b.getGrafico());
		for (Obstaculo o: obstaculos)
			this.gui.addItem(o.getGrafico());
		
		this.gui.addItem(score);
		this.gui.addItem(vidaJugador);
		this.gui = gui;
		this.gui.addItem(jugador.getGrafico());
		this.gui.addItem(score);
	}
	
	private void crearNivel() {
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
		for (Entidad a:entidades) {
			a.congelar();
		}
	}
	
	public void descongelar() {
		for(Entidad a:entidades)
			a.descongelar();
	}
	
	public void scoreUp() {
		score.increase(100);
	}
	
	public boolean nextLevel() {
		if (nivel.getSiguiente() == null)
			return false;
		else {
			nivel = nivel.getSiguiente();
			crearNivel();
			return true;
		}
	}
}