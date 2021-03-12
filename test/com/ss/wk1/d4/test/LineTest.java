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
		assertEquals(0, new Line(0,0,2,0));
		//slope = 1
		assertEquals(1, new Line(0,0,1,1));
		//divide by 0
		assertEquals(new ArithmeticException(), new Line(0,0,0,1));
	}

	@Test
	public void getDistanceTest() {
		
	}

	@Test
	public void parallelToTest() {
		
	}
}
