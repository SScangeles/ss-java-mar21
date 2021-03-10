/**
 * 
 */
package com.ss.wk1.d2.shapes;

/**
 * Rectangle class requires length and width.
 * @author Christian Angeles
 */
public class Rectangle implements ShapeInterface {
	private Integer length, width;
	private Double area;
	/**
	 * Input length and width of the rectangle.
	 * @param length
	 * @param width
	 */
	public Rectangle(Integer length, Integer width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void calculateArea() {
		area = length.doubleValue() * width;
		System.out.printf("Rectangle area=%.2f\n", area);
	}

	@Override
	public void display() {
		System.out.println("Draw rectangle with length="+length+" and width="+width);
	}

}
