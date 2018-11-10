package Objetos;

import java.util.Timer;
import java.util.TimerTask;

import mapa.Celda;
import personajes.Jugador;

public class SuperMisil extends Magia_temporal{
	protected static Timer timer=new Timer();
	private static int seconds=0;
	

	
	public SuperMisil(Celda c) {
		super(c);
	}

	public void actuar(Jugador j) {
		duracion=10;
		myTimer(j);
	}
	public static void myTimer(Jugador j) {
		seconds=0;
		TimerTask task;
		task=new TimerTask() {
			public void run() {
				 if (seconds < duracion) {
		                j.enableMisil();
		            } else {
		            	j.disableMisil();
		                cancel();
		            }
		        }
		    };
		    timer.schedule(task,0,1000);
	}
}
