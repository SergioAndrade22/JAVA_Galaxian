package juego;

import java.awt.Color;
import javax.swing.JLabel;

public class Score extends JLabel {
	private static final long serialVersionUID = 1L;
	private static String base = "Score : ";
	private int points = 0;
	
	public Score() {
		super(base + 0);
		points = 0;
		this.setFocusable(false);
		this.setBounds(900, 0, 100, 35);
		this.setBackground(Color.CYAN);
	}
	
	public void increase(int i) {
		points += i;
		this.setText(base + points);
	}
	
	public void reset() {
		points = 0;
		this.setText(base + points);
	}
}