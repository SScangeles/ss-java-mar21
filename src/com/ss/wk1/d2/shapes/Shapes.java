/**
 * 
 */
package com.ss.wk1.d2.shapes;

/**
 * Week 1, Day 2 - Shape Interface
 * @author Christian Angeles
 */
public class Shapes {

	/**
	 * Start shapes project.
	 */
	public void start() {
		Rectangle rectangle = new Rectangle(10, 12);
		Triangle triangle = new Triangle(5, 9);
		Circle circle = new Circle(3);

		rectangle.display();
		rectangle.calculateArea();

		triangle.display();
		triangle.calculateArea();

		circle.display();
		circle.calculateArea();
	}

}
