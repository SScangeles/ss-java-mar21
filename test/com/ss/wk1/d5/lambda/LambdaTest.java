/**
 * 
 */
package com.ss.wk1.d5.lambda;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * @author Christian Angeles
 *
 */
public class LambdaTest {
	private List<String> expect = new ArrayList<>();
	private List<String> actual = new ArrayList<>();
	private Lambda lamb = new Lambda();
	
	@Test
	public void sortLenShortLongTest() {
		actual = Arrays.asList("aa", "bbb", "cc" , "d", "e", "ee", "eeee");
		expect = Arrays.asList("d", "e", "aa", "cc", "ee", "bbb", "eeee");
		assertEquals(expect, lamb.sortLenShortLong(actual));
		
		actual = Arrays.asList("aa", "b", "eee");
		expect = Arrays.asList("b", "aa", "eee");
		assertEquals(expect, lamb.sortLenShortLong(actual));
	}
	
	@Test
	public void sortLenLongShortTest() {
		actual = Arrays.asList("aa", "bbb", "cc" , "d", "e", "ee", "eeee");
		expect = Arrays.asList("eeee", "bbb", "aa", "cc", "ee", "d", "e");
		assertEquals(expect, lamb.sortLenLongShort(actual));
		
		actual = Arrays.asList("aa", "b", "eee");
		expect = Arrays.asList("eee", "aa", "b");
		assertEquals(expect, lamb.sortLenLongShort(actual));
	}
	
	@Test
	public void sortAlphabetTest() {
		actual = Arrays.asList("aa", "bbb", "cc" , "d", "e", "ee", "eeee");
		expect = Arrays.asList("aa", "bbb", "cc", "d", "e", "ee", "eeee");
		assertEquals(expect, lamb.sortAlphabet(actual));
		
		actual = Arrays.asList("aa", "eee", "bb");
		expect = Arrays.asList("aa", "bb", "eee");
		assertEquals(expect, lamb.sortAlphabet(actual));
	}
	
	@Test
	public void sortEFirstTest() {
		actual = Arrays.asList("aa", "bbb", "cc" , "d", "e", "ee", "eeee");
		expect = Arrays.asList("eeee", "ee", "e", "aa", "bbb", "cc", "d");
		assertEquals(expect, lamb.sortEFirst(actual));
		
		actual = Arrays.asList("aa", "b", "eee");
		expect = Arrays.asList("eee", "aa", "b");
		assertEquals(expect, lamb.sortEFirst(actual));
	}
	
	@Test
	public void sortEFirstUtilTest(){
		actual = Arrays.asList("aa", "bbb", "cc" , "d", "e", "ee", "eeee");
		expect = Arrays.asList("eeee", "ee", "e", "aa", "bbb", "cc", "d");
		assertEquals(expect, lamb.sortEFirstUtil(actual));
		
		actual = Arrays.asList("aa", "b", "eee");
		expect = Arrays.asList("eee", "aa", "b");
		assertEquals(expect, lamb.sortEFirstUtil(actual));
	}
}
