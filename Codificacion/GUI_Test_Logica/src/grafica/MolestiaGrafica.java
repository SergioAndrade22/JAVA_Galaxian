package grafica;

import javax.swing.ImageIcon;

public class MolestiaGrafica extends EntidadGrafica {
	
	public MolestiaGrafica(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/Molestia.png"));
	}
}