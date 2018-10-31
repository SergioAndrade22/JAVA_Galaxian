package mapa;

import java.util.ArrayList;
import personajes.Malo;
import personajes.Mediator;

public class ConcreteFactoryEnemy extends AbstractFactoryEnemy {

	public ArrayList<Malo> create(int cant, Mediator med) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new Malo(med));
		return toRet;
	}
}