/**
 * 
 */
package com.ss.wk1.d2.maxnumber;

/**
 * Week 1, Day 2 - Find the max number and index position of 2D array.
 * @author Christian Angeles
 */
public class MaxNumber {

	/**
	 * Starts max number project.
	 */
	public void start() {
		CreateArray numbers = new CreateArray(5, 10);
		
		MaxNumberUtil.printArray(numbers);
		MaxNumberUtil.getMaxNum(numbers);
		MaxNumberUtil.getPosition(numbers);
	}

}
