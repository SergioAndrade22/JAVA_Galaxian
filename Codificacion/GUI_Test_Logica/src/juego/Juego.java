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
<<<<<<< HEAD
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
=======
		this.gui = gui;
		nivelNuevo(new NivelUnico());
		this.gui.addItem(score);
		this.gui.addItem(jugador.getGrafico());
	}
	public void nivelNuevo(Nivel n) {
		if(n!=null) {
			nivel = n;
			nivel.createEnemies();
			malos = nivel.getEnemies();
			nivel.createObjects();
			obst = nivel.getObjects();
			
			
			mapa.place(malos);
			for (Malo m : malos)
				this.gui.addItem(m.getGrafico());
			mapa.placeB(obst);
			for (Barricada b : obst)
				this.gui.addItem(b.getGrafico());
			
		}
		else 
			System.out.println("Fin de Juego!");
	}
	
	
	public void moverEnemigos(){
		synchronized(malos) {
			//if (malos.size() != 0)
				for(Malo en : malos){
					int y=jugador.getPos().getY();
					en.mover(y);
				}
		}
>>>>>>> 1e8c94a9be4456db3667584cb2549e62cd19c2a0
	}
	
	public void moverEntidades(){
		synchronized(entidades) {
			for(Entidad en : entidades)
					en.mover();
		}
	}
	
	public void mover(int dir){
		jugador.mover(dir);
<<<<<<< HEAD
=======
		System.out.printf("Posicion del jugador x:%d y:%d \n", jugador.getPos().getX(), jugador.getPos().getY());
		if(malos.isEmpty()) {
			System.out.println("Ganaste");
			//nivelNuevo(nivel.getSiguiente());
		}
			
	}
	
	public void removeDisparo(Disparo e) {
		synchronized (disparos) {
			System.out.printf("Hay %d disparos. \n", disparos.size());
			disparos.remove(e);
			//System.out.println(disparos.size());
			gui.remover(e.getGrafico());
			System.out.printf("Quedan %d disparos. \n", disparos.size());
		}
>>>>>>> 1e8c94a9be4456db3667584cb2549e62cd19c2a0
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