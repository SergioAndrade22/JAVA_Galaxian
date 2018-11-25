package personajes;

public class VidaSinEscudo extends State{

	public VidaSinEscudo(Jugador j) {
		this.j=j;
	}
	public VidaSinEscudo(Jugador jug,int vida) {
		this.vida=vida;
		j=jug;
	}
	
	@Override
	public void disminuirHP(int i) {
		vida-=i;		
		if(vida==0) {
			j.loss();
			System.out.printf("El jugador murio.");
		}
	}
	
	public void completarHP() {
		vida=100;
	}

	@Override
	public int getVida() {
		return vida;
	}
	

}
