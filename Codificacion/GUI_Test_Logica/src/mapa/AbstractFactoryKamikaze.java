package mapa;

import java.util.ArrayList;
import personajes.Malo;
import personajes.Mediator;

public abstract class AbstractFactoryKamikaze {
	public abstract ArrayList<Malo> createBuscador(int cant, Mediator med);
	public abstract ArrayList<Malo> createPaseador(int cant, Mediator med);
	public abstract ArrayList<Malo> createVariante(int cant, Mediator med);
}
