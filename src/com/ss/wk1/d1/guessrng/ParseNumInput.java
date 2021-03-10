/**
 * 
 */
package com.ss.wk1.d1.guessrng;

/**
 * Parse a StringBuilder object for numbers.
 * @author Christian Angeles
 */
public class ParseNumInput {
	/**
	 * Returns an array of integers.
	 * @param input
	 * @return
	 */
	public Integer[] getIntegers(StringBuilder input) {
		String[] tempStrArr = input.toString().split(" ");
		Integer[] tempArr = new Integer[tempStrArr.length];
		
		try {
			for(int i = 0; i < tempStrArr.length; ++i) {
				tempArr[i] = Integer.parseInt(tempStrArr[i]);
			}
		}
		catch(Exception e) {
			System.out.println("Invalid integer input.");
		}
		
		return tempArr;
	}
	/**
	 * Returns an array of doubles.
	 * @param input
	 * @return
	 */
	public Double[] getDoubles(StringBuilder input) {
		String[] tempStrArr = input.toString().split(" ");
		Double[] tempArr = new Double[tempStrArr.length];
		
		try {
			for(int i = 0; i < tempStrArr.length; ++i) {
				tempArr[i] = Double.parseDouble(tempStrArr[i]);
			}
		}
		catch(Exception e) {
			System.out.println("Invalid double input.");
		}
		
		return tempArr;
	}
}
