package com.edu.ru.oop.objects;

import static org.junit.Assert.*;

import org.junit.Test;

import kareltherobot.Directions;
import kareltherobot.UrRobot;
import kareltherobot.World;

public class KarelJTest {

	@Test
	public void test() {
		World.setSize(10, 10);
		World.setVisible();
		UrRobot robot = new UrRobot(1, 1, Directions.East, 0);
	}

}
