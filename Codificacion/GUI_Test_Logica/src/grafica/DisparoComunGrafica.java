package grafica;

import javax.swing.ImageIcon;

public class DisparoComunGrafica extends DisparoJugadorGrafica{

	public DisparoComunGrafica(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/Bullet.png"));
	}
}