/**
 * 
 */
package com.ss.wk1.project;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author Christian Angeles
 *
 */
public class PerformOpsTest {

	@Test
	public void isOddTest() {
		//true
		assertTrue(PerformOps.isOdd(1).performOps());
		assertTrue(PerformOps.isOdd(3).performOps());
		assertTrue(PerformOps.isOdd(5).performOps());
		
		//false
		assertFalse(PerformOps.isOdd(2).performOps());
		assertFalse(PerformOps.isOdd(4).performOps());
		assertFalse(PerformOps.isOdd(6).performOps());
	}
	
	@Test
	public void isPrimeTest() {

		//true
		assertTrue(PerformOps.isPrime(3).performOps());
		assertTrue(PerformOps.isPrime(7).performOps());
		assertTrue(PerformOps.isPrime(97).performOps());
		
		//false
		assertFalse(PerformOps.isPrime(1).performOps());
		assertFalse(PerformOps.isPrime(9).performOps());
		assertFalse(PerformOps.isPrime(49).performOps());
	}
	
	@Test
	public void isPalindrome() {
		//true
		assertTrue(PerformOps.isPalindrome(12021).performOps());
		assertTrue(PerformOps.isPalindrome(1221).performOps());
		assertTrue(PerformOps.isPalindrome(898).performOps());

		//false
		assertFalse(PerformOps.isPalindrome(1101).performOps());
		assertFalse(PerformOps.isPalindrome(123).performOps());
		assertFalse(PerformOps.isPalindrome(89).performOps());
	}
}
