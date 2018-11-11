/**
 * 
 */
package com.edu.ru.oop.figures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.edu.ru.oop.figures.objects.Rectangle;
import com.edu.ru.oop.figures.robots.RectangeDrawer;

import kareltherobot.Directions;
import kareltherobot.World;

/**
 * @author r414pc1
 *
 */
public class RectangleDrawerTest {

	@Test
	public void test() {
		World.setSize(20, 20);
		World.setDelay(0);
		World.setVisible();
		RectangeDrawer robot = new RectangeDrawer(2, 2, Directions.East, 100);
		Rectangle rectangle = new Rectangle(5, 5, 4, 2);
		robot.draw(rectangle);
		assertEquals(5, robot.getStreet());
		assertEquals(5, robot.getAvenue());
	}
	
}
