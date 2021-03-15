/**
 * 
 */
package com.ss.wk1.project;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Christian Angeles
 *
 */
public class FunctionalsTest {
	List<Integer> actual = new ArrayList<>();
	List<Integer> expect = new ArrayList<>();
	
	@Test
	public void rightDigitTest() {
		// [1, 22, 93] -> [1, 2, 3]
		actual = Arrays.asList(1,22,93);
		expect = Arrays.asList(1,2,3);
		assertEquals(expect, Functionals.rightDigit(actual));
		
		// [16, 8, 886, 8, 1] -> [6, 8, 6, 8, 1]
		actual = Arrays.asList(16,8,886,8,1);
		expect = Arrays.asList(6,8,6,8,1);
		assertEquals(expect, Functionals.rightDigit(actual));
		
		// [10, 0] -> [0, 0]
		actual = Arrays.asList(10,0);
		expect = Arrays.asList(0,0);
		assertEquals(expect, Functionals.rightDigit(actual));
	}
	
	@Test
	public void doublingTest() {
		// [1, 2, 3] -> [2, 4, 6]
		actual = Arrays.asList(1,2,3);
		expect = Arrays.asList(2,4,6);
		assertEquals(expect, Functionals.doubling(actual));

		// [6, 8, 6, 8, -1] -> [12, 16, 12, 16, -2]
		actual = Arrays.asList(6,8,6,8,-1);
		expect = Arrays.asList(12,16,12,16,-2);
		assertEquals(expect, Functionals.doubling(actual));
		
		// [] -> []
		actual = Arrays.asList();
		expect = Arrays.asList();
		assertEquals(expect, Functionals.doubling(expect));
	}
	
	@Test
	public void noXTest() {
		// ["ax", "bb", "cx"] -> ["a", "bb", "c"]
		assertEquals(new ArrayList<String>(Arrays.asList("a", "bb", "c")), Functionals.noX(new ArrayList<String>(Arrays.asList("ax", "bb", "cx"))));
		
		// ["xxax", "xbxbx", "xxcx"] -> ["a", "bb", "c"]
		assertEquals(new ArrayList<String>(Arrays.asList("a", "bb", "c")), Functionals.noX(new ArrayList<String>(Arrays.asList("xxax", "xbxbx", "xxcx"))));
		
		// ["x"] -> [""]
		assertEquals(new ArrayList<String>(Arrays.asList("")), Functionals.noX(new ArrayList<String>(Arrays.asList("x"))));

	}
}
