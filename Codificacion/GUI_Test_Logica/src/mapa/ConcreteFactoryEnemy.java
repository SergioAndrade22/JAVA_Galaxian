package mapa;

import java.util.ArrayList;
import personajes.Malo;

public class ConcreteFactoryEnemy extends AbstractFactoryEnemy {

	public ArrayList<Malo> create(int cant) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new Malo());
		return toRet;
	}
}