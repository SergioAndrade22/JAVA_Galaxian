package personajes;

public class VidaConEscudo extends State {

	public VidaConEscudo(Jugador jug) {
		j=jug;
	}
	public VidaConEscudo(Jugador jug,int vida) {
		this.vida=vida;
		j=jug;
	}

	@Override
	public void recibirGolpe(int i) {}
	
	
}
