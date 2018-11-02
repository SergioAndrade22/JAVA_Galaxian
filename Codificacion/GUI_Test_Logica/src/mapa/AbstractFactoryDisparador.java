package mapa;

import java.util.ArrayList;
import personajes.Malo;
import personajes.Mediator;

public abstract class AbstractFactoryDisparador {
	public abstract ArrayList<Malo> createPerdedorArma(int cant, Mediator med);
	public abstract ArrayList<Malo> createMaloArma(int cant, Mediator med);
}