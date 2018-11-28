package personajes;

public class VidaSinEscudo extends State{

	public VidaSinEscudo(Jugador j) {
		vida=100;
		this.j=j;
	}
	public VidaSinEscudo(Jugador jug,int vida) {
		this.vida=vida;
		j=jug;
	}
	
	public void recibirGolpe(int i) {
		vida-=i;
	}
}
