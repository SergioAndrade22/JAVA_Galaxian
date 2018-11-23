package niveles;

import java.util.ArrayList;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;
import inteligencias.Mediator;
import personajes.Malo;

public abstract class Nivel {
	protected AbstractFactoryKamikaze kamikazeFac;
	protected AbstractFactoryDisparador disparadorFac;
	protected AbstractFactoryObject objectFac;
	protected Nivel next;
	protected ArrayList<Malo> enemies;
	protected ArrayList<Barricada> barricadas;
	protected ArrayList<Obstaculo> obstaculos;
	protected ArrayList<Premio> premios;
	protected int cant;
	
	public Nivel() {
		enemies = new ArrayList<Malo>();
		barricadas = new ArrayList<Barricada>();
		premios=new ArrayList<Premio>();
	}
	
	public abstract void createEnemies(Mediator med);
	
	public void createBarricadas() {
		barricadas = objectFac.createBarricadas(cant);
	}
	
	public void createObstaculos() {
		obstaculos = objectFac.createObstaculos(cant);
	}
	
	public ArrayList<Barricada> getBarricadas(){
		return barricadas;
	}
	
	public ArrayList<Obstaculo> getObstaculos(){
		return obstaculos;
	}
	
	public ArrayList<Malo> getEnemies(){
		return enemies;
	}
	
	public Nivel getSiguiente() {
		return next;
	}
}