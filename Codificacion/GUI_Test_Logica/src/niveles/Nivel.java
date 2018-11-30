package niveles;

import java.util.ArrayList;

import objetos.Objeto;
import objetos.Premio;
import personajes.Malo;

public abstract class Nivel {
	protected AbstractFactoryKamikaze kamikazeFac;
	protected AbstractFactoryDisparador disparadorFac;
	protected AbstractFactoryObject objectFac;
	protected Nivel next;
	protected ArrayList<Malo> enemies;
	protected ArrayList<Objeto> objetos;
	protected int cant;
	
	public Nivel() {
		enemies = new ArrayList<Malo>();
		objetos = new ArrayList<Objeto>();
	}
	
	public abstract void createEnemies();
	
	public void createBarricadas() {
		objetos.addAll(objectFac.createBarricadas(cant));
	}
	
	public void createObstaculos() {
		objetos.addAll(objectFac.createObstaculos(cant));
	}
	
	public ArrayList<Objeto> getObjetos(){
		return objetos;
	}
	
	public ArrayList<Malo> getEnemies(){
		return enemies;
	}
	
	public Nivel getSiguiente() {
		return next;
	}
	
	public Premio getPremio() {
		return objectFac.createPremio();
	}
	
	public int getCant() {
		return cant;
	}
}