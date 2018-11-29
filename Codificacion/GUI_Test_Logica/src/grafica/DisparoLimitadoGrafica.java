package grafica;

import javax.swing.ImageIcon;

public class DisparoLimitadoGrafica extends DisparoJugadorGrafica {

	public DisparoLimitadoGrafica(int velocidad, int x, int y) {
		super(velocidad, x, y);
		this.image[0] = new ImageIcon(this.getClass().getResource("/BattleCity/disparo2.png"));
		
	}
}
