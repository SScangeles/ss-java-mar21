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

	@Test
	public void threeLowerATest() {
		actual = Arrays.asList("aaa", "abra", "Abe", "cat", "ava");
		expect = Arrays.asList("aaa", "ava");
		assertEquals(expect, AThree.threeLowerA(actual));
		
		expect = Arrays.asList("aaa", "ava", "Abe");
		assertNotEquals(expect, AThree.threeLowerA(actual));
	}
}
