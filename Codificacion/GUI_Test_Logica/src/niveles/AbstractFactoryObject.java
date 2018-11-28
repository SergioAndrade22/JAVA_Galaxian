package niveles;

import java.util.ArrayList;
import Objetos.Objeto;
import Objetos.Premio;

public abstract class AbstractFactoryObject {
	public abstract ArrayList<Objeto> createBarricadas(int cant);
	public abstract ArrayList<Objeto> createObstaculos(int cant);
	public abstract Premio createPremio();
}