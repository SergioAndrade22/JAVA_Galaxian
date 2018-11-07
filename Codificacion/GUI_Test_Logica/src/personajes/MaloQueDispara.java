package personajes;

public class MaloQueDispara extends Malo{

	public MaloQueDispara(Mediator m) {
		super();
		strat=new PaseadorArmado(this,m);
	}
	

}
