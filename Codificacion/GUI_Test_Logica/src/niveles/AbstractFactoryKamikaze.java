package niveles;

import java.util.ArrayList;
import personajes.Malo;

public abstract class AbstractFactoryKamikaze {
	public abstract ArrayList<Malo> createBuscador(int cant);
	public abstract ArrayList<Malo> createPaseador(int cant);
	public abstract ArrayList<Malo> createVariante(int cant);
}
