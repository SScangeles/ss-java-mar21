/**
 * 
 */
package com.ss.wk1.d1.guessrng;

/**
 * Utility class for RNG guessing game.
 * @author Christian Angeles
 */
public class GuessRngUtil {
	/**
	 * Checks if user number is between +/-10 of the random number. Returns true if guess is correct.
	 * @param userNum
	 * @param randNum
	 * @return
	 */
	public boolean checkNum(int userNum, int randNum) {
		int randNumLow, randNumHigh;
		
		if(randNum > 10) {
			randNumLow = randNum - 10;
		}
		else {
			randNumLow = 1;
		}
		
		if(randNum <= 90) {
			randNumHigh = randNum + 10;
		}
		else {
			randNumHigh = 100;
		}
		
		System.out.println("Random # generated: " + randNum);
		
		if(userNum <= randNumHigh && userNum >= randNumLow) {
			System.out.println("Your guess is be between " + randNumLow + " and " + randNumHigh + ".");
			return true;
		}
		else {
			System.out.println("Your guess must be between " + randNumLow + " and " + randNumHigh + ".");
			return false;
		}
	}
}
