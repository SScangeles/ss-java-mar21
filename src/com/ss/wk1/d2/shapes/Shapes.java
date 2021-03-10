/**
 * 
 */
package com.ss.wk1.d2.shapes;

/**
 * @author Christian Angeles
 */
public class Shapes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
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
