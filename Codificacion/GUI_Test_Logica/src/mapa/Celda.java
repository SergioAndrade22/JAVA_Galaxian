package mapa;

import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import personajes.Entidad;

public class Celda {
	public static final int LEFT = KeyEvent.VK_LEFT;
	public static final int RIGHT = KeyEvent.VK_RIGHT;
	public static final int UP = KeyEvent.VK_UP;
	public static final int DOWN = KeyEvent.VK_DOWN;
	private List<Entidad> entidades;
	private Mapa mapa;
	private int x;
	private int y;
	protected boolean hayObstaculo;

	public Celda(Mapa mapa, int x, int y) {
		entidades = new CopyOnWriteArrayList<Entidad>();
		this.mapa = mapa;
		this.x = x;
		this.y = y;
		hayObstaculo = false;
	}

	public List<Entidad> entidades() {
		return entidades;
	}

	public void addEntidad(Entidad e) {
		synchronized (entidades) {
			entidades.add(e);
			for (Entidad en : entidades)
				en.colision(e);
		}
	}

	public void removeEntidad(Entidad e) {
		synchronized (entidades) {
			entidades.remove(e);
		}
	}

	public void eliminarEntidad(Entidad e) {
		synchronized (entidades) {
			entidades.remove(e);
			entidades.clear();
			mapa.remove(e);
		}

	}

	public Celda getVecina(int dir) {
		switch (dir) {
		case UP:
			if (y - 1 >= 0) {
				return this.mapa.getCelda(x, y - 1);
			} else {
				return this.mapa.getCelda(x, mapa.getHeight() - 1);
			}
		case DOWN:
			if (y + 1 < mapa.getHeight())
				return this.mapa.getCelda(x, y + 1);
			else {
				return this.mapa.getCelda(x, 0);
			}
		case LEFT:
			if (x - 1 >= 0)
				return this.mapa.getCelda(x - 1, y);
			else {
				return this.mapa.getCelda(mapa.getWidth() - 1, y);
			}
		case RIGHT:
			if (x + 1 < mapa.getWidth())
				return this.mapa.getCelda(x + 1, y);
			else {
				return this.mapa.getCelda(mapa.getWidth() - 1, y);
			}
		}
		return null;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public boolean isEndX() {
		return mapa.getCelda(mapa.getWidth() - 1, y) == this;
	}

	public boolean isStartX() {
		return mapa.getCelda(0, y) == this;
	}

	public void setObstaculo(boolean es) {
		hayObstaculo = es;
	}

	public boolean esObstaculo() {
		return hayObstaculo;
	}
}