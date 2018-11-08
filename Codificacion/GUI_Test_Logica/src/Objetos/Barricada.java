package Objetos;

import Colliders.Collider;
import grafica.BarricadaGrafica;
import mapa.Celda;
import personajes.Entidad;

public class Barricada extends Objeto{
	
	public Barricada() {
		grafico=new BarricadaGrafica(velocidad,0,0);
	}
	
	public Barricada(Celda c){
		super(c);
		grafico = new BarricadaGrafica(velocidad, c.getX(), c.getY());
	}
	
	public Barricada(Celda c, int hp){
		super(c,hp);
		grafico=new BarricadaGrafica(velocidad, c.getX(),c.getY());
	}

	@Override
	public void colision(Entidad e) {
		
	}

	@Override
	public void aceptar(Collider c) {
		// TODO Auto-generated method stub
		
	}

	public void setGrafico() {
		this.grafico = new BarricadaGrafica(velocidad, pos.getX(), pos.getY());		
	}
	
	public void mover() {}
}