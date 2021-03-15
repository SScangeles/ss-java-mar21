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
public class PerformOpsUtilTest {

	@Test
	public void isOddTest() {
		//true
		assertTrue(PerformOpsUtil.isOdd(1).check());
		assertTrue(PerformOpsUtil.isOdd(3).check());
		assertTrue(PerformOpsUtil.isOdd(5).check());
		
		//false
		assertFalse(PerformOpsUtil.isOdd(2).check());
		assertFalse(PerformOpsUtil.isOdd(4).check());
		assertFalse(PerformOpsUtil.isOdd(6).check());
	}
	
	@Test
	public void isPrimeTest() {

		//true
		assertTrue(PerformOpsUtil.isPrime(3).check());
		assertTrue(PerformOpsUtil.isPrime(7).check());
		assertTrue(PerformOpsUtil.isPrime(97).check());
		
		//false
		assertFalse(PerformOpsUtil.isPrime(1).check());
		assertFalse(PerformOpsUtil.isPrime(9).check());
		assertFalse(PerformOpsUtil.isPrime(49).check());
	}
	
	@Test
	public void isPalindrome() {
		//true
		assertTrue(PerformOpsUtil.isPalindrome(12021).check());
		assertTrue(PerformOpsUtil.isPalindrome(1221).check());
		assertTrue(PerformOpsUtil.isPalindrome(898).check());

		//false
		assertFalse(PerformOpsUtil.isPalindrome(1101).check());
		assertFalse(PerformOpsUtil.isPalindrome(123).check());
		assertFalse(PerformOpsUtil.isPalindrome(89).check());
	}
}
