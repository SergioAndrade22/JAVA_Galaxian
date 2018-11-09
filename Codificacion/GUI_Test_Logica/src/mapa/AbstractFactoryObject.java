package mapa;

import java.util.ArrayList;
import Objetos.Barricada;
import Objetos.Premio;

public abstract class AbstractFactoryObject {
	public abstract ArrayList<Barricada> create(int cant);
}