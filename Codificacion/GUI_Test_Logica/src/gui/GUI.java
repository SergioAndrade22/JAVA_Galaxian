package gui;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import juego.Juego;
import personajes.Disparo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Juego j;
	private ContadorTiempoEnemigos tiempoEnemigos;
	private ContadorTiempoJugador tiempoJugador;
	private ContadorTiempoDisparos tiempoDisparos;
	private boolean lock = false;
	private int direction = -1;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
					frame.setBounds(0, 0,1024,720);
					frame.setSize(1024, 720);
					frame.setTitle("Shoot the Zombies");
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUI() {
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				switch(arg0.getKeyCode()) {
					case KeyEvent.VK_SPACE :
						j.disparoJugador();
						contentPane.repaint();
						contentPane.revalidate();
						contentPane.updateUI();
						break;
					default:
						mover(arg0);
						break;
				}
			}
		});
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0,1024,720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		agregarObstaculo();
		j = new Juego(this);
		tiempoJugador = new ContadorTiempoJugador(j, this);
		tiempoEnemigos = new ContadorTiempoEnemigos(j);
		tiempoDisparos = new ContadorTiempoDisparos(j);
		tiempoJugador.start();
		tiempoEnemigos.start();
		tiempoDisparos.start();
		
	}
	
	protected void mover(KeyEvent key){
		if(!lock){
			direction = key.getKeyCode();
			this.lock = true;
		}
	}
	
	public boolean getLock(){
		return this.lock;
	}
	
	public void toggleLock(){
		this.lock = !this.lock;
	}
	
	public int getDirection(){
		return this.direction;
	}
	
	public void addDisparo(Disparo d) {
		contentPane.add(d.getGrafico());
	}
	
	public void stopDisparos() {
		tiempoDisparos.pause();	
	}
	
	public void restartDisparos() {
		tiempoDisparos.restart();
	}
	
	public void agregarFondo() {
		JLabel f = new JLabel();
		ImageIcon i = new ImageIcon(this.getClass().getResource("/BattleCity/Desert.jpg"));
		f.setBounds(0, 0, 1200, 800);
		f.setIcon(i);
		contentPane.add(f);
	}
	public void agregarObstaculo() {
		JLabel f=new JLabel();
		ImageIcon i = new ImageIcon(this.getClass().getResource("/BattleCity/Obstaculos.png"));
		f.setBounds(78, -2, 50,50);
		f.setIcon(i);
		contentPane.add(f);
	}
}