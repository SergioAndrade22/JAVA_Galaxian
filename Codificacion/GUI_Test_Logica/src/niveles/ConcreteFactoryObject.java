package niveles;

import java.util.ArrayList;
import java.util.Random;
import Objetos.*;

public class ConcreteFactoryObject extends AbstractFactoryObject {

	public ArrayList<Objeto> createBarricadas(int cant) {
		ArrayList<Objeto> toRet = new ArrayList<Objeto>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new Barricada());
		return toRet;
	}
	
	public ArrayList<Objeto> createObstaculos(int cant){
		ArrayList<Objeto> toRet= new ArrayList<Objeto>();
		for (int i=0 ; i< cant; i++) 
			toRet.add(new Obstaculo());
		return toRet;
	}
	
	public Premio createPremio() {
		Random r=new Random();
		Premio toRet=null;
		int i=r.nextInt(5);
		switch (i) {
			case 0: toRet= Congelar.getInstance();break;
			case 1: toRet=new MejoraArma();break;
			case 2: toRet= new PocionMagica();break;
			case 3: toRet= new Proteccion();break;
			case 4: toRet= SuperMisil.getInstance();break;
		}
		return toRet;
			
	}
}