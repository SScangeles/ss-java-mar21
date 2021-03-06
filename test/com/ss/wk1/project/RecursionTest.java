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
public class RecursionTest {
	Integer[] numList;
	Integer target;
	Integer index = 0;
	Recursion rc = new Recursion();
	
	@Test
	public void groupSumClumpTest() {
		// true
		numList = new Integer[] {2,4,4,8};
		target = 8;
		assertTrue(rc.groupSumClump(index, numList, target));
		target = 10;
		assertTrue(rc.groupSumClump(index, numList, target));
		target = 16;
		assertTrue(rc.groupSumClump(index, numList, target));
		
		// false
		target = 6;
		assertFalse(rc.groupSumClump(index, numList, target));
		target = 12;
		assertFalse(rc.groupSumClump(index, numList, target));
		target = 14;
		assertFalse(rc.groupSumClump(index, numList, target));
	}
}
