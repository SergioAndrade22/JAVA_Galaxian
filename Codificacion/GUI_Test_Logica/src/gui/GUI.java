package gui;

import java.awt.EventQueue;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import juego.Juego;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class GUI extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private Juego j;
	private ContadorTiempoJugador tiempoJugador;
	private ContadorTiempoEntidades tiempoEntidades;
	private boolean lock = false;
	private int direction = -1;
	private JLabel f;
	private Clip ambiente;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
					frame.setVisible(true);
					frame.setBounds(0, 0, 1000, 600);
					frame.setSize(1000, 600);					
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
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		mainScreen();
	}
	
	public void mainScreen() {
		f = new JLabel();
		ImageIcon i = new ImageIcon(this.getClass().getResource("/BattleCity/Start.jpg"));
		f.setBounds(0, 0, 1000, 600);
		f.setIcon(i);
		contentPane.add(f);
		MouseListener ml = new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				contentPane.remove(f);
				contentPane.repaint();
				contentPane.revalidate();
				contentPane.updateUI();
				removeMouseListener(this);
				startGame();
			}
		};
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent arg0) {
				switch(arg0.getKeyCode()) {
					case KeyEvent.VK_SPACE :
						j.disparoJugador();
						contentPane.repaint();
						contentPane.revalidate();
						contentPane.updateUI();
						Clip bang = cargarSonido();
						bang.start();
						break;
					default:
						mover(arg0);
						break;
				}
			}
		});
		addMouseListener(ml);
	}
	
	public void startGame() {
		ambiente = musicaAmbienteJuego();
		ambiente.start();
		agregarFondo();
		j = new Juego(this);
		tiempoJugador = new ContadorTiempoJugador(j, this);
		tiempoEntidades = new ContadorTiempoEntidades(j);
		tiempoJugador.start();
		tiempoEntidades.start();	
	}
	
	public void nextLevel() {
		if (j.hasNextLevel()) {
			ambiente.stop();
			contentPane.removeAll();
			f = new JLabel();
			ImageIcon i = new ImageIcon(this.getClass().getResource("/BattleCity/levelWin.png"));
			f.setBounds(0, 0, 1000, 600);
			f.setIcon(i);
			contentPane.add(f);
			contentPane.repaint();
			contentPane.revalidate();
			contentPane.updateUI();
			tiempoEntidades.stop();
			tiempoJugador.stop();
			tiempoEntidades = new ContadorTiempoEntidades(j);
			tiempoJugador = new ContadorTiempoJugador(j, this);
			j.clean();
			MouseListener ml = new MouseAdapter() {
				public void mouseClicked(MouseEvent arg0) {
					contentPane.remove(f);
					agregarFondo();
					j.playNext();
					ambiente.start();
					tiempoEntidades.start();
					tiempoJugador.start();
					contentPane.repaint();
					contentPane.revalidate();
					contentPane.updateUI();
					removeMouseListener(this);
				}
			};
			addMouseListener(ml);
		}
	}
	
	public void gameOver() {
		ambiente.stop();
		ambiente = musicaAmbienteDerrota();
		ambiente.start();
		contentPane.removeAll();
		f = new JLabel();
		ImageIcon i = new ImageIcon(this.getClass().getResource("/BattleCity/GameOver.png"));
		f.setBounds(0, 0, 1000, 600);
		f.setIcon(i);
		contentPane.add(f);
		contentPane.repaint();
		contentPane.revalidate();
		contentPane.updateUI();
		MouseListener ml = new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				contentPane.remove(f);
				contentPane.repaint();
				contentPane.revalidate();
				contentPane.updateUI();
				removeMouseListener(this);
				mainScreen();
			}
		};
		addMouseListener(ml);
		tiempoEntidades.stop();
		tiempoJugador.stop();
		j.clean();
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
	
	public void addItem(JLabel s) {
		f.add(s);
	}
	
	public void remover(JLabel l) {
		f.remove(l);
		f.repaint();
		f.revalidate();
	}
	
	public void agregarFondo() {
		f = new JLabel();
		ImageIcon i = new ImageIcon(this.getClass().getResource("/BattleCity/Desert.jpg"));
		f.setBounds(0, 0, 1000, 600);
		f.setIcon(i);
		contentPane.add(f);
	}
	
	public static Clip cargarSonido() {
		Clip clip = null;
		String ruta = "/BattleCity/Disparo.wav";
		try {
			InputStream is = GUI.class.getResourceAsStream(ruta);
			AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
			DataLine.Info info = new DataLine.Info(Clip.class, ais.getFormat());
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(ais);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return clip;
	}
	
	public static Clip musicaAmbienteJuego() {
		Clip clip = null;
		String ruta = "/BattleCity/Ambiente.wav";
		try {
			InputStream is = GUI.class.getResourceAsStream(ruta);
			AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
			DataLine.Info info = new DataLine.Info(Clip.class, ais.getFormat());
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(ais);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return clip;
	}
	
	public static Clip musicaAmbienteDerrota() {
		Clip clip = null;
		String ruta = "/BattleCity/Defeat.wav";
		try {
			InputStream is = GUI.class.getResourceAsStream(ruta);
			AudioInputStream ais = AudioSystem.getAudioInputStream(new BufferedInputStream(is));
			DataLine.Info info = new DataLine.Info(Clip.class, ais.getFormat());
			clip = (Clip) AudioSystem.getLine(info);
			clip.open(ais);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return clip;
	}
}