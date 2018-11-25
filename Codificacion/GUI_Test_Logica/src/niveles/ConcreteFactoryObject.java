package niveles;

import java.util.ArrayList;
import java.util.Random;

import Objetos.*;
import mapa.Celda;

public class ConcreteFactoryObject extends AbstractFactoryObject {

	public ArrayList<Barricada> createBarricadas(int cant) {
		ArrayList<Barricada> toRet = new ArrayList<Barricada>();
		for (int i = 0; i < cant; i++)
			toRet.add(new Barricada());
		return toRet;
	}
	
	public ArrayList<Obstaculo> createObstaculos(int cant){
		ArrayList<Obstaculo> toRet= new ArrayList<Obstaculo>();
		for (int i=0 ; i< cant; i++) {
			toRet.add(new Obstaculo());
		}
		return toRet;
	}
	public Premio createPremio() {
		Random r=new Random();
		Premio toRet=null;
		int i=r.nextInt(5);
		switch (i) {
			case 0: toRet= new Congelar();break;
			case 1: toRet=new MejoraArma();break;
			case 2: toRet= new PocionMagica();break;
			case 3: toRet= new Proteccion();break;
			case 4: toRet= new SuperMisil();break;
		}
		return toRet;
			
	}
}