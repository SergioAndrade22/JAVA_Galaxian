package grafica;

import javax.swing.ImageIcon;

public class DisparoMisilGrafica extends DisparoJugadorGrafica {
	
	public DisparoMisilGrafica(int velocidad,int x,int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/misil.png"));
	}
}
