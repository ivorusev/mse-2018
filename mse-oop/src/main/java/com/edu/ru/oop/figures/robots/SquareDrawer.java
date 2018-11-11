/**
 * 
 */
package com.edu.ru.oop.figures.robots;

import java.util.Objects;

import com.edu.ru.oop.figures.objects.Figure;
import com.edu.ru.oop.figures.objects.Square;
import com.edu.ru.oop.robots.AdvancedRobot;

import kareltherobot.Directions;

/**
 * Robot that can draw squares.
 * 
 * @author r414pc1
 *
 */
public class SquareDrawer extends AdvancedRobot {

	public SquareDrawer(int street, int avenue, Direction direction, int beepers) {
		super(street, avenue, direction, beepers);
	}

	public void draw(Figure figure) {
		Objects.requireNonNull(figure);
		if (!(figure instanceof Square)) {
			throw new IllegalArgumentException("Wrong figure type was passed!");
		}
		
		Square square = (Square) figure;
		moveRobotTo(square.getX(), square.getY());
		turnRobotToDirection(Directions.East);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < square.getSide() - 1; j++) {
				putBeeper();
				move();
			}
			turnRight();
		}
	}
}
