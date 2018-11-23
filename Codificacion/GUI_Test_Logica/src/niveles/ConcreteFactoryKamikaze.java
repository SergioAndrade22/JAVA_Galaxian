package niveles;

import java.util.ArrayList;
import personajes.KamikazeAleatorio;
import personajes.KamikazeBuscador;
import personajes.KamikazePaseador;
import personajes.Malo;

public class ConcreteFactoryKamikaze extends AbstractFactoryKamikaze {

	public ArrayList<Malo> createBuscador(int cant) {
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new KamikazeBuscador());
		return toRet;
	}
	
	public ArrayList<Malo> createPaseador(int cant){
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new KamikazePaseador());
		return toRet;
	}
	
	public ArrayList<Malo> createVariante(int cant){
		ArrayList<Malo> toRet = new ArrayList<Malo>();
		for (int i = 0; i < cant; i++) 
			toRet.add(new KamikazeAleatorio());
		return toRet;
	}
}