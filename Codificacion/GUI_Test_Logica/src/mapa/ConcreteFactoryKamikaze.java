package mapa;

import java.util.ArrayList;
import personajes.Malo;
import personajes.MaloKamikazeBuscador;
import personajes.MaloKamikazePaseador;
import personajes.MaloKamikazeVariante;
import personajes.Mediator;

public class ConcreteFactoryKamikaze extends AbstractFactoryKamikaze {

	public ArrayList<Malo> createBuscador(int cant, Mediator med) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new MaloKamikazeBuscador(med));
		return toRet;
	}
	
	public ArrayList<Malo> createPaseador(int cant, Mediator med){
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new MaloKamikazePaseador(med));
		return toRet;
	}
	
	public ArrayList<Malo> createVariante(int cant, Mediator med){
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new MaloKamikazeVariante(med));
		return toRet;
	}
}