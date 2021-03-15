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
		MaxNumberUtil maxnum = new MaxNumberUtil();
		CreateArray numbers = new CreateArray(5, 10);
		
		maxnum.printArray(numbers);
		maxnum.getMaxNum(numbers);
		maxnum.getPosition(numbers);
	}

}
