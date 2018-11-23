package niveles;

import personajes.Malo;

public class NivelFinal extends Nivel {
	
	public NivelFinal() {
		super();
		cant = 10;
		disparadorFac = new ConcreteFactoryDisparador();
		kamikazeFac = new ConcreteFactoryKamikaze();
		objectFac = new ConcreteFactoryObject();
		next = null;
	}
	
	public void createEnemies() {
		for (Malo m : disparadorFac.createMaloArma(cant/5))
			enemies.add(m);
		for (Malo m : disparadorFac.createPerdedorArma(cant/5))
			enemies.add(m);
		for (Malo m : kamikazeFac.createBuscador(cant/5))
			enemies.add(m);
		for (Malo m : kamikazeFac.createPaseador(cant/5))
			enemies.add(m);
		for (Malo m : kamikazeFac.createVariante(cant/5))
			enemies.add(m);
	}
}