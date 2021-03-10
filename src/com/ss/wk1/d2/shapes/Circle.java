/**
 * 
 */
package com.ss.wk1.d2.shapes;

/**
 * Circle class requires radius.
 * @author Christian Angeles
 */
public class Circle implements ShapeInterface {
	private Integer radius;
	private Double area;
	/**
	 * Input radius of circle.
	 * @param radius
	 */
	public Circle(Integer radius) {
		this.radius = radius;
	}

	@Override
	public void calculateArea() {
		area = Math.PI * (radius.doubleValue() * radius);
		System.out.printf("Circle area=%.2f\n", area);
	}

	@Override
	public void display() {
		System.out.println("Draw circle with radius="+radius);
	}

}
