package niveles;

import java.util.ArrayList;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;

public abstract class AbstractFactoryObject {
	public abstract ArrayList<Barricada> createBarricadas(int cant);
	public abstract ArrayList<Obstaculo> createObstaculos(int cant);
	public abstract Premio createPremio();
}