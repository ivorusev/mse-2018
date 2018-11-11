package com.edu.ru.oop.robots;

import kareltherobot.Robot;

public class RightTurner extends Robot {
	
	private int street;
	private int avenue;

	public RightTurner(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		this.street = street;
		this.avenue = avenue;
	}

	public RightTurner(int street, int avenue, Direction direction) {
		super(street, avenue, direction, 0);
		this.street = street;
		this.avenue = avenue;
	}
	
	@Override
	public void move() {
		super.move();
		if (facingEast()) {
			street++;
		} else if (facingWest()) {
			street--;
		} else if (facingNorth()) {
			avenue++;
		} else if (facingSouth()) {
			avenue--;
		}
	}

	/**
	 * Turns the robot right by turning it left 3 times.
	 */
	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

	public int getStreet() {
		return street;
	}

	public int getAvenue() {
		return avenue;
	}
}
