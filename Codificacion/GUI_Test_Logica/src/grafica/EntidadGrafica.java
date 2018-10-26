package grafica;

import java.awt.Point;
import javax.swing.Icon;
import javax.swing.JLabel;
import mapa.Celda;

public abstract class EntidadGrafica {
	protected JLabel grafico;
	protected Icon image[];
	protected final int width = 50; //Aca agrando el tamaño del JLabel
	protected final int height= 50;
	protected int velocidad;
	protected Point pos;
	
	protected EntidadGrafica(int velocidad, int x, int y) {
		this.pos = new Point(x * this.width, y * this.height);
		this.velocidad = velocidad;
		this.image = new Icon[1];
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public Point getPos() {
		return pos;
	}
	
	public void mover(int dir){
		if(this.grafico != null){
			try {
				switch (dir){
					case Celda.UP : // Arriba
						for(int i = 0; i < this.height; i += this.velocidad){
							if (this.pos.y - this.velocidad < 0) {
								this.grafico.setBounds(this.pos.x, 545, width, height);
								this.pos.setLocation(pos.x, 545);
							}
							else
								this.grafico.setBounds(this.pos.x, this.pos.y -= this.velocidad, width, height);
							Thread.sleep(50); //original t:100
						}
						break;
					case Celda.DOWN : // Abajo
						for(int i = 0; i < this.height; i += this.velocidad){
							if (this.pos.y + this.velocidad > 515) {
								this.grafico.setBounds(this.pos.x, 0, width, height);
								this.pos.setLocation(pos.x, -30);
							}
							else
								this.grafico.setBounds(this.pos.x, this.pos.y += this.velocidad, width, height);
							Thread.sleep(50); //original t:100
						}
						break;
					case Celda.RIGHT : // Derecha
						for(int i = 0; i < this.width; i += this.velocidad){
							if (this.pos.x + this.velocidad > 955) {
								this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
								this.pos.setLocation(pos);
							}
							else
								this.grafico.setBounds(this.pos.x += this.velocidad, this.pos.y, width, height);
							Thread.sleep(50); //original t:100
						}
						break;
					case Celda.LEFT : // Izquierda
						for(int i = 0; i < this.width; i += this.velocidad){
							if (this.pos.x - this.velocidad < 0) {
								this.grafico.setBounds(955, this.pos.y, width, height);
								this.pos.setLocation(955, this.pos.y);
							}
							else
								this.grafico.setBounds(this.pos.x -= this.velocidad, this.pos.y, width, height);
							Thread.sleep(50); //original t:100
						}
						break;
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public JLabel getGrafico(){
		if(this.grafico == null){
			this.grafico = new JLabel(image[0]);
			this.grafico.setBounds(this.pos.x, this.pos.y, width, height);
		}
		return this.grafico;
	}
}
