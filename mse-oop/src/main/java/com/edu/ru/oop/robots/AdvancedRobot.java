package com.edu.ru.oop.robots;

import java.util.function.Predicate;

import kareltherobot.Directions;
import kareltherobot.Robot;

public class AdvancedRobot extends Robot {
	
	private int street;
	private int avenue;
	private int beepers;
	
	private Predicate<Direction> isNotFacingEast = direction -> {
		return (direction == Directions.East) && !facingEast();
	};
	
	private Predicate<Direction> isNotFacingWest = direction -> {
		return (direction == Directions.West) && !facingWest();
	};
	
	private Predicate<Direction> isNotFacingNorth = direction -> {
		return (direction == Directions.North) && !facingNorth();
	};
	
	private Predicate<Direction> isNotFacingSouth = direction -> {
		return (direction == Directions.South) && !facingSouth();
	};

	public AdvancedRobot(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
		this.street = street;
		this.avenue = avenue;
		this.beepers = beepers;
	}

	public AdvancedRobot(int street, int avenue, Direction direction) {
		super(street, avenue, direction, 0);
		this.street = street;
		this.avenue = avenue;
		this.beepers = 0;
	}
	
	protected void moveRobotTo(int street, int avenue) {
		while (street > this.getStreet()) {
			turnRobotToDirection(Directions.East);
			move();
		}
		while (street < this.getStreet()) {
			turnRobotToDirection(Directions.West);
			move();
		}
		while (avenue > this.getAvenue()) {
			turnRobotToDirection(Directions.North);
			move();
		}
		while (avenue > this.getAvenue()) {
			turnRobotToDirection(Directions.South);
			move();
		}
	}
	
	protected void turnRobotToDirection(Direction direction) {
		while (isNotFacingEast.test(direction)) {
			turnLeft();
		}
		while (isNotFacingWest.test(direction)) {
			turnLeft();
		}
		while (isNotFacingNorth.test(direction)) {
			turnLeft();
		}
		while (isNotFacingSouth.test(direction)) {
			turnLeft();
		}
	}
	
	@Override
	public void putBeeper() {
		super.putBeeper();
		beepers--;
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
	
	public int getBeepers() {
		return beepers;
	}
}
