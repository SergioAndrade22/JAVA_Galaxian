package mapa;

public class NivelDos extends Nivel{

	public NivelDos(int cant) {
		enemyFac = new ConcreteFactoryEnemy();
		objectFac = new ConcreteFactoryObject();
		this.cant=cant;
		next=null;
	}

}
