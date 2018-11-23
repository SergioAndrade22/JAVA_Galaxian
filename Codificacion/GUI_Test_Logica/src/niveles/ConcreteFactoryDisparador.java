package niveles;

import java.util.ArrayList;
import personajes.Malo;
import personajes.MaloQueDispara;
import personajes.PerdedorArma;

public class ConcreteFactoryDisparador extends AbstractFactoryDisparador {

	public ArrayList<Malo> createPerdedorArma(int cant) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new PerdedorArma());
		return toRet;
	}

	public ArrayList<Malo> createMaloArma(int cant) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new MaloQueDispara());
		return toRet;
	}
}