/**
 * 
 */
package com.ss.wk1.d4.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ss.wk1.d4.line.Line;

/**
 * @author Christian Angeles
 *
 */
public class LineTest {
	
	@Test
	public void getSlopeTest() {
		//slope = 0
		assertEquals(0, new Line(0,0,2,0).getSlope(), 0.0001);
		//slope = 1
		assertEquals(1, new Line(0,0,1,1).getSlope(), 0.0001);
	}

	@Test(expected = ArithmeticException.class)
	public void getSlopeTestException() {
		//divide by 0
		new Line(0,0,0,1).getSlope();
	}

	@Test
	public void getDistanceTest() {
		
	}

	@Test
	public void parallelToTest() {
		
	}
}
