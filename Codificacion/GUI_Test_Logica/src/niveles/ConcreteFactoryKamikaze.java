package niveles;

import java.util.ArrayList;

import inteligencias.Mediator;
import personajes.KamikazeAleatorio;
import personajes.KamikazeBuscador;
import personajes.KamikazePaseador;
import personajes.Malo;

public class ConcreteFactoryKamikaze extends AbstractFactoryKamikaze {

	public ArrayList<Malo> createBuscador(int cant, Mediator med) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new KamikazeBuscador(med));
		return toRet;
	}
	
	public ArrayList<Malo> createPaseador(int cant, Mediator med){
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new KamikazePaseador(med));
		return toRet;
	}
	
	public ArrayList<Malo> createVariante(int cant, Mediator med){
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new KamikazeAleatorio(med));
		return toRet;
	}
}