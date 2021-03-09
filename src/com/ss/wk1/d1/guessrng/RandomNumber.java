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
	private int randNumber;
	/**
	 * Initialize variable: rng, randNumber;
	 */
	public RandomNumber() {
		rng = new Random();
		randNumber = 0;
	}
	/**
	 * Returns randomly generated number (1-100).
	 * @return
	 */
	public int getRandNumber() {
		randNumber = rng.nextInt(100) + 1;
		return randNumber;
	}
}
