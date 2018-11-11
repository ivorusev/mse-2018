package com.edu.ru.oop.robots;

import kareltherobot.Robot;

public class FancyRightTurner extends Robot implements RinghtTurnerInterface {

	public FancyRightTurner(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public FancyRightTurner(int i, int j, Direction east) {
		super(i, j, east, 0);
	}

	public void turnRight() {
		for (int i = 0; i < 3; i++) {
			move();
			turnLeft();
			if (!this.frontIsClear()) {
				throw new RobotHitWallException("The robot has encountered a wall");
			}
		}
		move();
	}

}
