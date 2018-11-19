package Objetos;

import java.util.Timer;
import java.util.TimerTask;

import mapa.Celda;
import personajes.Jugador;

public class Congelar extends Magia_temporal{
	protected static Timer timer=new Timer();
	private static int seconds=0;
	

	public Congelar(Celda c) {
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
		                j.congelar();
		                seconds++;
		            } else {
		            	j.descongelar();
		                cancel();
		            }
		        }
		    };
		    timer.schedule(task,1,1000);
	}

}
