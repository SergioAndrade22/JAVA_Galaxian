package Objetos;
import personajes.*;
import mapa.*;

public abstract class Objeto extends Entidad{

	public Objeto() {
		hp = 100;
	}
	
	public Objeto(Celda c){
		super(c);
	}
	
	public Objeto(Celda c,int hp){
		super(c,hp);
	}
	
	public void congelar() {}
	
	public void descongelar() {}
	
	//Se contempla separar en Barricada y Obstaculo, ya que cuando un disparo del enemigo colisione con uno o con otro, necesito saber
	// si fue con una barricada o con un obstaculo para saber si hacer algo o no. (Los disparos de los enemigos no afectan barricadas)
	
}