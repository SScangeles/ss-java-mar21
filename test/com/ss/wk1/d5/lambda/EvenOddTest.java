/**
 * 
 */
package com.ss.wk1.d5.lambda;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Christian Angeles
 *
 */
public class EvenOddTest {
	List<Integer> actual = new ArrayList<>();

	@Test
	public void numListToStringTest() {
		actual = Arrays.asList(3,44);
		assertEquals("'o3,e44'", EvenOdd.numListToString(actual));
		
		actual = Arrays.asList(3,44);
		assertNotEquals("o3,e44", EvenOdd.numListToString(actual));
	}
}
