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
	PerformOpsUtil pOpsUtil = new PerformOpsUtil();

	@Test
	public void isOddTest() {
		//true
		assertTrue(pOpsUtil.isOdd(1).check());
		assertTrue(pOpsUtil.isOdd(3).check());
		assertTrue(pOpsUtil.isOdd(5).check());
		
		//false
		assertFalse(pOpsUtil.isOdd(2).check());
		assertFalse(pOpsUtil.isOdd(4).check());
		assertFalse(pOpsUtil.isOdd(6).check());
	}
	
	@Test
	public void isPrimeTest() {

		//true
		assertTrue(pOpsUtil.isPrime(3).check());
		assertTrue(pOpsUtil.isPrime(7).check());
		assertTrue(pOpsUtil.isPrime(97).check());
		
		//false
		assertFalse(pOpsUtil.isPrime(1).check());
		assertFalse(pOpsUtil.isPrime(9).check());
		assertFalse(pOpsUtil.isPrime(49).check());
	}
	
	@Test
	public void isPalindrome() {
		//true
		assertTrue(pOpsUtil.isPalindrome(12021).check());
		assertTrue(pOpsUtil.isPalindrome(1221).check());
		assertTrue(pOpsUtil.isPalindrome(898).check());

		//false
		assertFalse(pOpsUtil.isPalindrome(1101).check());
		assertFalse(pOpsUtil.isPalindrome(123).check());
		assertFalse(pOpsUtil.isPalindrome(89).check());
	}
}
