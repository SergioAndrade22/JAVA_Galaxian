package mapa;

import java.util.ArrayList;
import Objetos.Objeto;
import personajes.Malo;

public abstract class Nivel {
	protected AbstractFactoryEnemy enemyFac;
	protected AbstractFactoryObject objectFac;
	protected Nivel next;
	protected ArrayList<Malo> enemies;
	protected ArrayList<Objeto> objects;
	protected int cant;
	
	public void createEnemies() {
		enemies = enemyFac.create(cant);
	}
	
	public void createObjects() {
		objects = objectFac.create(cant);
	}
	
	public ArrayList<Objeto> getObjects(){
		return objects;
	}
	
	public ArrayList<Malo> getEnemies(){
		return enemies;
	}
}