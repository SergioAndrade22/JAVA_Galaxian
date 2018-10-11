package personajes;

import javax.swing.JLabel;

import Colliders.*;
import grafica.EntidadGrafica;
import mapa.Celda;

public abstract class Entidad {
	protected Celda pos;
	protected EntidadGrafica grafico;
	protected Collider collider;
	protected int hp; //Vida de la entidad.
	//añadir arma
	
	protected Entidad(Celda pos) {
		this.pos = pos;
		this.grafico = null;
	}
	
	protected Entidad(Celda pos, int hp) {
		this.pos = pos;
		this.grafico = null;
		this.hp=hp;
	}

	public Celda getPos() {
		return pos;
	}
	
	
	public JLabel getGrafico(){
		return this.grafico.getGrafico();
	}
	
	public void colision(Entidad e) {
		
	}
	public void aceptar(Collider c) {
		
	}
	
	public void eliminar(){ //Cuando elimine una entidad, deberia ocurrir algo.
	}

}
