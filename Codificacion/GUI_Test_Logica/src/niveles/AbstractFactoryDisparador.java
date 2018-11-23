package niveles;

import java.util.ArrayList;
import personajes.Malo;

public abstract class AbstractFactoryDisparador {
	public abstract ArrayList<Malo> createPerdedorArma(int cant);
	public abstract ArrayList<Malo> createMaloArma(int cant);
}