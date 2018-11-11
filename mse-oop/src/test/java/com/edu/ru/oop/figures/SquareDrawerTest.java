package com.edu.ru.oop.figures;

import static org.junit.Assert.*;

import org.junit.Test;

import com.edu.ru.oop.figures.objects.Square;
import com.edu.ru.oop.figures.robots.SquareDrawer;

import kareltherobot.Directions;
import kareltherobot.World;

public class SquareDrawerTest {

	@Test
	public void test() {
		World.setSize(20, 20);
		World.setDelay(0);
		World.setVisible();
		SquareDrawer robot = new SquareDrawer(2, 2, Directions.East, 100);
		Square square = new Square(5, 5, 4);
		robot.draw(square);
		assertEquals(5, robot.getStreet());
		assertEquals(5, robot.getAvenue());
		int beepersUsed = square.getSide() * 2 + (square.getSide() - 2) * 2;
		assertEquals(100 - beepersUsed, robot.getBeepers());
	}

}
