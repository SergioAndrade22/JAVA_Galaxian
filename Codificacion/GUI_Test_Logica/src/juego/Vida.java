package juego;

import java.awt.Color;

import javax.swing.JLabel;

import personajes.Jugador;

public class Vida extends JLabel{
	private static final long serialVersionUID = 1L;
	private static String base = "HP: ";
	private int hp = 100;
	private Jugador jugador;
		
	public Vida(Jugador j) {
		super(base + 100);
		hp = 100;
		jugador=j;
		this.setFocusable(false);
		this.setBounds(700, 0, 100, 35);
		this.setBackground(Color.CYAN);
	}
	public void update() {
		hp = jugador.getHP();
		this.setText(base + hp);
	}
}
