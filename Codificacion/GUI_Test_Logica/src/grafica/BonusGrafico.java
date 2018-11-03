package grafica;

import javax.swing.ImageIcon;

public class BonusGrafico extends EntidadGrafica{

	public BonusGrafico(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/bonus.png"));
	}

}
