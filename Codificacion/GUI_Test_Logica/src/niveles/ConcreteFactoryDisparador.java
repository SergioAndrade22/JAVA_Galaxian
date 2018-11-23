package niveles;

import java.util.ArrayList;

import inteligencias.Mediator;
import personajes.Malo;
import personajes.MaloQueDispara;
import personajes.PerdedorArma;

public class ConcreteFactoryDisparador extends AbstractFactoryDisparador {

	public ArrayList<Malo> createPerdedorArma(int cant, Mediator med) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new PerdedorArma(med));
		return toRet;
	}

	public ArrayList<Malo> createMaloArma(int cant, Mediator med) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new MaloQueDispara(med));
		return toRet;
	}

}
