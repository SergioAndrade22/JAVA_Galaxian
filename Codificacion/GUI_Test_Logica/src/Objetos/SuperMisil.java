package Objetos;

import java.util.Timer;
import java.util.TimerTask;

import Disparo.Arma;
import Disparo.ArmaMisil;
import mapa.Celda;
import personajes.Jugador;

public class SuperMisil extends Magia_temporal{
	protected  Timer timer=new Timer();
	private int seconds=0;
	private static SuperMisil instance;
	

	
	private SuperMisil() {
		super();
	}

	public static SuperMisil getInstance() {
		return (instance==null)?instance=new SuperMisil():instance;
	}
	public void actuar(Jugador j) {
		System.out.println("Activado SuperMisil");
		duracion=10;
		myTimer(j);
	}
	public void myTimer(Jugador j) {
		seconds=0;
		Arma ant=j.setArma(new ArmaMisil(j,100));
		TimerTask task;
		task=new TimerTask() {
			public void run() {
				 if (seconds < duracion) {
					 	
		                seconds++;
		            } else {
		            	j.setArma(ant);
		                cancel();
		            }
		        }
		    };
		    timer.schedule(task,0,1000);
	}
}
