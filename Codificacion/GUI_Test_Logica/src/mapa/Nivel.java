package mapa;

import java.util.ArrayList;
import Objetos.Barricada;
import personajes.Malo;

public abstract class Nivel {
	protected AbstractFactoryEnemy enemyFac;
	protected AbstractFactoryObject objectFac;
	protected Nivel next;
	protected ArrayList<Malo> enemies;
	protected ArrayList<Barricada> objects;
	protected int cant;
	
	public void createEnemies() {
		enemies = enemyFac.create(cant);
	}
	
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