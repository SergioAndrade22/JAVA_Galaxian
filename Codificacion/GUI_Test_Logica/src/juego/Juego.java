package juego;

import java.util.ArrayList;
import java.util.Random;
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
	private Mapa mapa;
	private int tamanioCelda = 50;
	private GUI gui;
	private Score score;
	private Nivel nivel;
	
	public Juego(GUI gui){
		this.mapa = new Mapa(gui, gui.getWidth()/tamanioCelda, gui.getHeight()/tamanioCelda); //hay que modificarlo para poder hacerlo con el archivo
		Celda c = this.mapa.getCelda(0, gui.getHeight()/tamanioCelda/2);
		jugador = new Jugador(c);
		disparos= new ArrayList<Disparo>();
		this.malos = new ArrayList<Malo>();
		score = new Score();
		nivel = new NivelUnico();
		nivel.createEnemies();
		malos = nivel.getEnemies();
		mapa.place(malos);
		this.gui = gui;
		this.gui.add(jugador.getGrafico());
		gui.add(score);
	}
	
	public void moverEnemigos(){
		for(Malo en : malos){
				en.mover();
				Disparo d = en.disparar();
				disparos.add(d);
				gui.addDisparo(d);
		}
	}
	
	public void moverDisparos() {
		for (Disparo d : disparos)
			d.mover();
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