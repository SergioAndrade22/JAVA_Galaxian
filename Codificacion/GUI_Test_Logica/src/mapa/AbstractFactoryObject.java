package mapa;

import java.util.ArrayList;
import Objetos.Barricada;
import Objetos.Obstaculo;
import Objetos.Premio;

public abstract class AbstractFactoryObject {
	public abstract ArrayList<Barricada> create(int cant);
	public abstract ArrayList<Premio> createPremio(int cant);
	public abstract ArrayList<Obstaculo> createObstaculo(int cant);
}