package mapa;

import java.util.ArrayList;
import Objetos.Obstaculo;
import Objetos.Barricada;
import Objetos.Objeto_precioso;
import Objetos.Premio;

public class ConcreteFactoryObject extends AbstractFactoryObject {

	public ArrayList<Barricada> create(int cant) {
		ArrayList<Barricada> toRet = new ArrayList<Barricada>();
		for (int i = 0; i < cant; i++)
			toRet.add(new Barricada());
		return toRet;
	}

	public ArrayList<Premio> createPremio(int cant) {
		ArrayList<Premio> toRet=new ArrayList<Premio>();
		for (int i = 0; i < cant; i++)
			toRet.add(new Objeto_precioso());
		return toRet;
	}
	
	public ArrayList<Obstaculo> createObstaculo(int cant){
		ArrayList<Obstaculo> toRet = new ArrayList<Obstaculo>();
		for (int i = 0; i < cant; i++)
			toRet.add(new Obstaculo());
		return toRet;
	}

}
