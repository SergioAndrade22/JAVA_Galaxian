package personajes;

public class KamikazeAleatorio extends Malo {
	
	protected Mediator med;

	public KamikazeAleatorio(Mediator m){
		super(m);
		strat=new BuscadorSinArma(this,m);
	}
	public void disminuirHP(int i) {
		super.disminuirHP(i);
		if(hp<50)
			strat=new PaseadorSinArma(this,med);
	}

}
