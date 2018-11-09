package mapa;

import java.util.ArrayList;
import Objetos.Barricada;
import Objetos.Premio;
import personajes.Malo;
import personajes.Mediator;

public abstract class Nivel {
	protected AbstractFactoryKamikaze kamikazeFac;
	protected AbstractFactoryDisparador disparadorFac;
	protected AbstractFactoryObject objectFac;
	protected Nivel next;
	protected ArrayList<Malo> enemies;
	protected ArrayList<Barricada> objects;
	protected ArrayList<Premio> premios;
	protected int cant;
	
	public Nivel() {
		enemies = new ArrayList<Malo>();
		objects = new ArrayList<Barricada>();
		premios=new ArrayList<Premio>();
	}
	
	public abstract void createEnemies(Mediator med);
	
	public void createObjects() {
		objects = objectFac.create(cant);
	}
	
	public ArrayList<Barricada> getObjects(){
		return objects;
	}
	
	public ArrayList<Malo> getEnemies(){
		return enemies;
	}
	
	public Nivel getSiguiente() {
		return next;
	}
}