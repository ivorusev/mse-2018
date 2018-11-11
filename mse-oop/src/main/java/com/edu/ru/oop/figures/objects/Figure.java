package com.edu.ru.oop.figures.objects;

/**
 * This is base class for all figures.
 * 
 * @author r414pc1
 *
 */
public abstract class Figure {

	private int x;
	private int y;

	public Figure(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
