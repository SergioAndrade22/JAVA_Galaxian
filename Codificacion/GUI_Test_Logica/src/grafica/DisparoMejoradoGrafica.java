package grafica;

import javax.swing.ImageIcon;

public class DisparoMejoradoGrafica extends DisparoJugadorGrafica {

	public DisparoMejoradoGrafica(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/disparo1.png"));
	}
}
