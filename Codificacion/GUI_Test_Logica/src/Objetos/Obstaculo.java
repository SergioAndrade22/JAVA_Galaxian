package Objetos;

import Colliders.Collider;
import grafica.MolestiaGrafica;
import mapa.Celda;
import personajes.Entidad;

public class Obstaculo extends Objeto{
	
	public Obstaculo() {
		
	}
	
	public Obstaculo(Celda c){
		super(c);
		this.grafico = new MolestiaGrafica(velocidad, c.getX(), c.getY());
	}
	
	public Obstaculo(Celda c, int hp){
		super(c,hp);
	}

	@Override
	public void colision(Entidad e) {
		
	}

	@Override
	public void aceptar(Collider c) {
		// TODO Auto-generated method stub
		
	}

	public void setGrafico() {
		this.grafico = new MolestiaGrafica(velocidad, pos.getX(), pos.getY());		
	}
	
	public void mover() {}
}