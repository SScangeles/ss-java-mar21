/**
 * 
 */
package com.ss.wk1.d1.guessrng;

import java.util.Random;

/**
 * Generates a random number.
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
	 * Returns randomly generated positive number.
	 * @return
	 */
	public int getPosRandNumber() {
		return rng.nextInt() + 1;
	}
	/**
	 * Returns randomly generated positive number (1 to maxRange).
	 * @param maxRange
	 * @return
	 */
	public int getPosRandNumber(int maxRange) {
		return rng.nextInt(maxRange) + 1;
	}
}
