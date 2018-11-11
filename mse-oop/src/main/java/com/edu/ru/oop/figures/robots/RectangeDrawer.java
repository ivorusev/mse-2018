package com.edu.ru.oop.figures.robots;

import java.util.Objects;

import com.edu.ru.oop.figures.objects.Figure;
import com.edu.ru.oop.figures.objects.Rectangle;
import com.edu.ru.oop.robots.AdvancedRobot;

import kareltherobot.Directions;

public class RectangeDrawer extends AdvancedRobot {

	public RectangeDrawer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public void draw(Figure figure) {
		Objects.requireNonNull(figure);
		if (!(figure instanceof Rectangle)) {
			throw new IllegalArgumentException("Wrong object type!");
		}
		
		Rectangle rectangle = (Rectangle) figure;
		moveRobotTo(rectangle.getX(), rectangle.getY());
		turnRobotToDirection(Directions.East);
		
		for (int i = 0; i < 4; i++) {
			int sideLength = i % 2 == 0 ? rectangle.getSide() : rectangle.getSecondSide();
			for (int j = 0; j < sideLength - 1; j++) {
				putBeeper();
				move();
			}
			turnRight();
		}
	}

}
