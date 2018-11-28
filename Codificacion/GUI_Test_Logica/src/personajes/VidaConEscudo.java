package personajes;

public class VidaConEscudo extends State {

	public VidaConEscudo(Jugador jug) {
		vida=100;
		j=jug;
	}
	
	public VidaConEscudo(Jugador jug,int vida) {
		this.vida=vida;
		j=jug;
	}

	public void recibirGolpe(int i) {}
}