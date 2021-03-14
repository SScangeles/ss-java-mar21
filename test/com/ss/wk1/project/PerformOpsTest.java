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
		assertTrue(PerformOps.isOdd(1).check());
		assertTrue(PerformOps.isOdd(3).check());
		assertTrue(PerformOps.isOdd(5).check());
		
		//false
		assertFalse(PerformOps.isOdd(2).check());
		assertFalse(PerformOps.isOdd(4).check());
		assertFalse(PerformOps.isOdd(6).check());
	}
	
	@Test
	public void isPrimeTest() {

		//true
		assertTrue(PerformOps.isPrime(3).check());
		assertTrue(PerformOps.isPrime(7).check());
		assertTrue(PerformOps.isPrime(97).check());
		
		//false
		assertFalse(PerformOps.isPrime(1).check());
		assertFalse(PerformOps.isPrime(9).check());
		assertFalse(PerformOps.isPrime(49).check());
	}
	
	@Test
	public void isPalindrome() {
		//true
		assertTrue(PerformOps.isPalindrome(12021).check());
		assertTrue(PerformOps.isPalindrome(1221).check());
		assertTrue(PerformOps.isPalindrome(898).check());

		//false
		assertFalse(PerformOps.isPalindrome(1101).check());
		assertFalse(PerformOps.isPalindrome(123).check());
		assertFalse(PerformOps.isPalindrome(89).check());
	}
}
