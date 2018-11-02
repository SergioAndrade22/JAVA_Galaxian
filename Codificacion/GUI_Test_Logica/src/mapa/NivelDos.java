package mapa;

import personajes.Mediator;

public class NivelDos extends Nivel{

	public NivelDos(int cant) {
		kamikazeFac = new ConcreteFactoryKamikaze();
		objectFac = new ConcreteFactoryObject();
		this.cant=cant;
		next=null;
	}

	public void createEnemies(Mediator med) {
		
	}
}