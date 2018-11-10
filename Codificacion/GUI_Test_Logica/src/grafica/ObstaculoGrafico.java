package grafica;

import javax.swing.ImageIcon;

public class ObstaculoGrafico extends EntidadGrafica {
	
	public ObstaculoGrafico(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/Molestias.png"));
	}
}