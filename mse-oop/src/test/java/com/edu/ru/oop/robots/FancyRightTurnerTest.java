package com.edu.ru.oop.robots;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import kareltherobot.Directions;
import kareltherobot.World;

public class FancyRightTurnerTest {
	
	@BeforeClass
	public static void init() {
		World.setSize(3, 3);
		World.setDelay(0);
	}

	@Test
	public void testTurnRightSuccess() {
		FancyRightTurner robot = new FancyRightTurner(2, 2, Directions.North);
		robot.turnRight();
		assertEquals(true, robot.facingEast());
	}
	
	@Test
	public void testTurnRightSuccess_East() {
		FancyRightTurner robot = new FancyRightTurner(2, 2, Directions.East);
		robot.turnRight();
		assertEquals(true, robot.facingSouth());
	}
	
	@Test(expected = RobotHitWallException.class)
	public void testTurnRightFailed() {
		FancyRightTurner robot = new FancyRightTurner(1, 1, Directions.North);
		robot.turnRight();
	}
}
