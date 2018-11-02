package mapa;

import java.util.ArrayList;
import personajes.Malo;
import personajes.MaloQueDispara;
import personajes.MaloQuePierdeArma;
import personajes.Mediator;

public class ConcreteFactoryDisparador extends AbstractFactoryDisparador {

	public ArrayList<Malo> createPerdedorArma(int cant, Mediator med) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new MaloQuePierdeArma(med));
		return toRet;
	}

	public ArrayList<Malo> createMaloArma(int cant, Mediator med) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new MaloQueDispara(med));
		return toRet;
	}

}
