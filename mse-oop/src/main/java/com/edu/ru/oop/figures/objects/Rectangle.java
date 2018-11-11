package com.edu.ru.oop.figures.objects;

/**
 * TODO:
 * 
 * @author r414pc1
 *
 */
public class Rectangle extends Square {
	
	private int secondSide; 
	
	public Rectangle(int x, int y, int side, int secondSide) {
		super(x, y, side);
		this.secondSide = secondSide;
	}
	
	public int getSecondSide() {
		return secondSide;
	}
}
