package mapa;

import java.util.ArrayList;
import Objetos.Barricada;

public class ConcreteFactoryObject extends AbstractFactoryObject {

	public ArrayList<Barricada> create(int cant) {
		ArrayList<Barricada> toRet = new ArrayList<Barricada>();
		for (int i = 0; i < cant; i++)
			toRet.add(new Barricada());
		return toRet;
	}

}
