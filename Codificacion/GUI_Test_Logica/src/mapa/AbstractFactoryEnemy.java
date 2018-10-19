package mapa;

import java.util.ArrayList;
import personajes.Malo;

public abstract class AbstractFactoryEnemy {
	public abstract ArrayList<Malo> create(int cant);
}
