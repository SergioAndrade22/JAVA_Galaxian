package grafica;

import javax.swing.ImageIcon;

public class DisparoMisilGrafico extends EntidadGrafica {
	
	public DisparoMisilGrafico(int velocidad,int x,int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/disparo1.png"));
	}

}
