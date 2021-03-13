/**
 * 
 */
package com.ss.wk1.d4.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.ss.wk1.d4.line.Line;

/**
 * Test cases for Line class.
 * @author Christian Angeles
 */
public class LineTest {
	
	@Test
	public void getSlopeTest() {
		//slope = 0
		assertEquals(0, new Line(0,0,2,0).getSlope(), 0);
		//slope = 1
		assertEquals(1, new Line(0,0,1,1).getSlope(), 0);
	}

	@Test(expected = ArithmeticException.class)
	public void getSlopeExceptionTest() {
		//x1 = x2
		new Line(0,0,0,1).getSlope();
	}

	@Test
	public void getDistanceTest() {
		//distance = 0
		assertEquals(0, new Line(0,0,0,0).getDistance(), 0);
		//distance = 1
		assertEquals(1, new Line(0,0,0,1).getDistance(), 0);
		//distance = 2.236
		assertEquals(2.236, new Line(0,0,1,2).getDistance(), 0.001);
	}

	@Test
	public void parallelToTest() {
		//parallel to same line
		assertTrue(new Line(0,0,1,0).parallelTo(new Line(0,0,1,0)));
		//parallel to different line
		assertTrue(new Line(0,0,1,0).parallelTo(new Line(0,2,1,2)));
		//not parallel
		assertFalse(new Line(0,0,1,0).parallelTo(new Line(0,0,1,1)));
		
	}
}
