package grafica;

import javax.swing.ImageIcon;

public class DisparoGrafico extends EntidadGrafica{

	public DisparoGrafico(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/Bullet.png"));
	}
}