package com.edu.ru.oop.robots;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import kareltherobot.Directions;
import kareltherobot.World;

public class RobotsCoordinatesTest {
	
	@BeforeClass
	public static void init() {
		World.setSize(3, 3);
		World.setDelay(0);
	}

	@Test
	public void testCoordinatesMoveStreetInc() {
		AdvancedRobot rightTurner = new AdvancedRobot(2, 2, Directions.East);
		rightTurner.move();
		assertEquals(3, rightTurner.getStreet());
		assertEquals(2, rightTurner.getAvenue());
	}
	
	@Test
	public void testCoordinatesMoveStreetDec() {
		AdvancedRobot rightTurner = new AdvancedRobot(2, 2, Directions.West);
		rightTurner.move();
		assertEquals(1, rightTurner.getStreet());
		assertEquals(2, rightTurner.getAvenue());
	}
	
	@Test
	public void testCoordinatesMoveAvenueInc() {
		AdvancedRobot rightTurner = new AdvancedRobot(2, 2, Directions.North);
		rightTurner.move();
		assertEquals(2, rightTurner.getStreet());
		assertEquals(3, rightTurner.getAvenue());
	}
	
	@Test
	public void testCoordinatesMoveStreet() {
		AdvancedRobot rightTurner = new AdvancedRobot(2, 2, Directions.South);
		rightTurner.move();
		assertEquals(2, rightTurner.getStreet());
		assertEquals(1, rightTurner.getAvenue());
	}
}
