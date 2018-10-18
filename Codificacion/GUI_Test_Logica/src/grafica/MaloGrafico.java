package grafica;

import javax.swing.ImageIcon;

public class MaloGrafico extends EntidadGrafica{
	
	public MaloGrafico(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/Zombie.png"));
	}
}