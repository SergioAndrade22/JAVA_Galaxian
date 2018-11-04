package grafica;

import javax.swing.ImageIcon;

public class DisparoEnemigoGrafico extends EntidadGrafica{

	public DisparoEnemigoGrafico(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/BulletEnemigo.png"));
	}
}