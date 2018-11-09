package juego;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import Disparo.Disparo;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;
import gui.GUI;
import mapa.Celda;
import mapa.Mapa;
import mapa.Nivel;
import mapa.NivelUnico;
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
	
	public Juego(GUI gui){
		this.gui = gui;
		mapa = new Mapa(this, (gui.getWidth()/tamanioCelda)-1, (gui.getHeight()/tamanioCelda)-1); 
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c, this);
		this.gui.addItem(jugador.getGrafico());
		med = new Mediator(jugador,this);
		entidades = new CopyOnWriteArrayList<Entidad>();
		score = new Score();
		nivel = new NivelUnico();
		nivel.createEnemies(med);
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
		this.gui = gui;
		//nivelNuevo(new NivelUnico());
		this.gui.addItem(score);
		this.gui.addItem(jugador.getGrafico());
	}
	
	public void nivelNuevo(Nivel n) {
		if(n!=null) {
			nivel = n;
			nivel.createEnemies(med);
			for (Entidad e: nivel.getEnemies())
				entidades.add(e);
			nivel.createBarricadas();
			barricadas = nivel.getBarricadas();
			mapa.place(entidades);
			for (Entidad e : entidades)
				gui.addItem(e.getGrafico());
			mapa.placeB(barricadas);
			for (Barricada b : barricadas)
				this.gui.addItem(b.getGrafico());
		}
		else 
			System.out.println("Fin de Juego!");
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
	
	public void cantEntidades() {
		int contador=0;
		Celda[][] aux= mapa.getMapa();
		for (int i=0 ; i < aux[0].length ; i++)
			for (int j=0; j < aux.length ; j++) {
				if (!aux[j][i].entidades().isEmpty())
					contador++;
			}
		System.out.println(contador);
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
	public void insertarPremio(Celda c, Premio p) {
		synchronized (entidades) {
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
}