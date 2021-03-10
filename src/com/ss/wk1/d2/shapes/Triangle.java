/**
 * 
 */
package com.ss.wk1.d2.shapes;

/**
 * Triangle class requires height and base.
 * @author Christian Angeles
 */
public class Triangle implements ShapeInterface {
	private Integer height, base;
	private Double area;
	/**
	 * Input height and base of the triangle.
	 * @param height
	 * @param base
	 */
	public Triangle(Integer height, Integer base) {
		this.height = height;
		this.base = base;
	}

	@Override
	public void calculateArea() {
		area = 0.5 * height.doubleValue() * base;
		System.out.printf("Triangle area=%.2f\n", area);
	}

	@Override
	public void display() {
		System.out.println("Draw triangle with base="+base+" and height="+height);
	}

}
