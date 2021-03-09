/**
 * 
 */
package com.ss.wk1.d1.guessrng;

import java.util.Random;

/**
 * Generates random number 1-100.
 * @author Christian Angeles
 */
public class RandomNumber {
	private Random rng;
	/**
	 * Initialize variable: rng
	 */
	public RandomNumber() {
		rng = new Random();
	}
	/**
	 * Returns randomly generated number (1-100).
	 * @return
	 */
	public int getRandNumber() {
		return rng.nextInt(100) + 1;
	}
}
