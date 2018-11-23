package niveles;

import personajes.Malo;

public class NivelInicial extends Nivel{

	public NivelInicial(int cant) {
		disparadorFac = new ConcreteFactoryDisparador();
		kamikazeFac = new ConcreteFactoryKamikaze();
		objectFac = new ConcreteFactoryObject();
		this.cant=cant;
		next = new NivelFinal();
	}

	public void createEnemies() {
		for (Malo m : disparadorFac.createMaloArma(cant/2))
			enemies.add(m);
		for (Malo m : disparadorFac.createPerdedorArma(cant/2))
			enemies.add(m);
	}
}