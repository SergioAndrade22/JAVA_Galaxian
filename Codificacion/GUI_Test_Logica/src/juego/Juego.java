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
	private List<Malo> malos;
	private List<Disparo> disparos;
	private ArrayList<Barricada> obst;
	private Mapa mapa;
	private int tamanioCelda = 50;
	private GUI gui;
	private Score score;
	private Nivel nivel;
	
	public Juego(GUI gui){
		mapa = new Mapa(this, (gui.getWidth()/tamanioCelda)-1, (gui.getHeight()/tamanioCelda)-1); //hay que modificarlo para poder hacerlo con el archivo
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c);
		disparos = new CopyOnWriteArrayList<Disparo>();
		malos = new CopyOnWriteArrayList<Malo>();
		obst = new ArrayList<Barricada>();
		score = new Score();
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
	}
	
	public void moverDisparos() {
		synchronized(disparos) {
			for (Disparo d : disparos)
				d.mover();
		}
	}
	
	public void mover(int dir){
		jugador.mover(dir);
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
	}
	
	public void removeMalo(Malo e) {
		synchronized (malos) {
			malos.remove(e);
			//System.out.println(disparos.size());
			gui.remover(e.getGrafico());
		}
	}
	
	public void disparoJugador(){
		synchronized(disparos) {
			Disparo d = jugador.disparar();
			disparos.add(d);
			gui.addItem(d.getGrafico());
		}
	}	
	public void removerEntidad(Entidad e) {}
}