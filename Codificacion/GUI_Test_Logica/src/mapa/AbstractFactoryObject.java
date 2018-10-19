package mapa;

import java.util.ArrayList;
import Objetos.Objeto;

public abstract class AbstractFactoryObject {
	public abstract ArrayList<Objeto> create(int cant);
}