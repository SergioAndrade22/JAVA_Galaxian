package personajes;

public class PerdedorArma extends Malo{

	protected Mediator med;
	
	public PerdedorArma(Mediator m) {
		super();
		strat=new BuscadorArmado(this,m);
		med=m;
	}
	public void disminuirHP(int i) {
		super.disminuirHP(i);
		if(hp<=50)
			strat=new PaseadorSinArma(this,med);
	}

}
