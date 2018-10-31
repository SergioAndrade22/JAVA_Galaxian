package mapa;

public class NivelUnico extends Nivel {
	
	public NivelUnico() {
		cant = 5;
		enemyFac = new ConcreteFactoryEnemy();
		objectFac = new ConcreteFactoryObject();
		next=new NivelDos(cant*3);
	}
}