package com.edu.ru.oop.figures.robots;

import com.edu.ru.oop.figures.objects.Figure;

/**
 * This is the drawer interface used by the robots.
 * 
 * @author r414pc1
 *
 */
public interface Drawer {
	
	/**
	 * Draws a geometric figure.
	 * 
	 * @param figure subclass of the {@link Figure} class.
	 */
	void draw(Figure figure);

}
