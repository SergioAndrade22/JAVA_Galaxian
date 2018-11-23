package niveles;

import inteligencias.Mediator;
import personajes.Malo;

public class NivelUnico extends Nivel {
	
	public NivelUnico() {
		super();
		cant = 5;
		disparadorFac = new ConcreteFactoryDisparador();
		kamikazeFac = new ConcreteFactoryKamikaze();
		objectFac = new ConcreteFactoryObject();
		next=new NivelDos(cant*3);
	}
	
	public void createEnemies(Mediator med) {
		for (Malo m : disparadorFac.createMaloArma(2, med))
			enemies.add(m);
		for (Malo m : disparadorFac.createPerdedorArma(2, med))
			enemies.add(m);
		for (Malo m : kamikazeFac.createBuscador(0, med))
			enemies.add(m);
		for (Malo m : kamikazeFac.createPaseador(0, med))
			enemies.add(m);
		for (Malo m : kamikazeFac.createVariante(0, med))
			enemies.add(m);
	}
}