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
public class AThreeTest {
	List<String> actual = new ArrayList<>();
	List<String> expect = new ArrayList<>();
	AThree at = new AThree();

	@Test
	public void threeLowerATest() {
		actual = Arrays.asList("aaa", "abra", "Abe", "cat", "ava");
		expect = Arrays.asList("aaa", "ava");
		assertEquals(expect, at.threeLowerA(actual));
		
		expect = Arrays.asList("aaa", "ava", "Abe");
		assertNotEquals(expect, at.threeLowerA(actual));
	}
}
