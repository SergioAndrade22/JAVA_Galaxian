package niveles;

import java.util.ArrayList;

import inteligencias.Mediator;
import personajes.Malo;

public abstract class AbstractFactoryKamikaze {
	public abstract ArrayList<Malo> createBuscador(int cant, Mediator med);
	public abstract ArrayList<Malo> createPaseador(int cant, Mediator med);
	public abstract ArrayList<Malo> createVariante(int cant, Mediator med);
}
