package grafica;

import javax.swing.ImageIcon;

public class JugadorGrafico extends EntidadGrafica{

	public JugadorGrafico(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/Soldier.gif"));
	}
}