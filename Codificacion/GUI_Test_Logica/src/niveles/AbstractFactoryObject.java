package niveles;

import java.util.ArrayList;

import objetos.Objeto;
import objetos.Premio;

public abstract class AbstractFactoryObject {
	public abstract ArrayList<Objeto> createBarricadas(int cant);
	public abstract ArrayList<Objeto> createObstaculos(int cant);
	public abstract Premio createPremio();
}