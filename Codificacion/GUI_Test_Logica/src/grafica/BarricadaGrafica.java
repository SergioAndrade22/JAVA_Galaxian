package grafica;

import javax.swing.ImageIcon;

public class BarricadaGrafica extends EntidadGrafica {
	
	public BarricadaGrafica(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/Obstaculo.png"));
	}
}