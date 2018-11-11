package com.edu.ru.oop.figures.objects;

/**
 * TODO: 
 * 
 * @author r414pc1
 *
 */
public class Square extends Figure {
	
	private int side;
	
	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

}
