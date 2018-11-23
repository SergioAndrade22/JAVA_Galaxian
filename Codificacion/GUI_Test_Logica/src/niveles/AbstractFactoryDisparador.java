package niveles;

import java.util.ArrayList;

import inteligencias.Mediator;
import personajes.Malo;

public abstract class AbstractFactoryDisparador {
	public abstract ArrayList<Malo> createPerdedorArma(int cant, Mediator med);
	public abstract ArrayList<Malo> createMaloArma(int cant, Mediator med);
}