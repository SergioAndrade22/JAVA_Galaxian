package personajes;

import mapa.Celda;
import personajes.Jugador;
public class Buscador extends Strategy{
	protected Jugador j;
	
	public Buscador(Malo m) {
		super(m);
	}
	public void mover(int y) {
		
		int yJug=y;
		int yMalo=m.getPos().getY();
		if(yJug<yMalo) { //Deberia moverse de forma diagonal peeero
			m.moverA(Celda.UP);
			//m.moverA(Celda.LEFT);
		}
		else
			if(yJug>yMalo) {
				m.moverA(Celda.DOWN);
				//m.moverA(Celda.LEFT);
			}
			else
				m.moverA(Celda.LEFT);
	}
}
