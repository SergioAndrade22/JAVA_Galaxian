package mapa;

import java.util.ArrayList;
import personajes.Malo;
import personajes.Mediator;

public abstract class AbstractFactoryEnemy {
	public abstract ArrayList<Malo> create(int cant, Mediator med);
}
