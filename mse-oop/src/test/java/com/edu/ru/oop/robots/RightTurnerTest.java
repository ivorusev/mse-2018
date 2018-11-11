package com.edu.ru.oop.robots;

import static org.junit.Assert.*;

import org.junit.Test;

import kareltherobot.Directions;

public class RightTurnerTest {

	@Test
	public void test() {
		AdvancedRobot robot = new AdvancedRobot(1, 1, Directions.East);
		robot.turnRight();
		assertEquals(true, robot.facingSouth());
	}

}
