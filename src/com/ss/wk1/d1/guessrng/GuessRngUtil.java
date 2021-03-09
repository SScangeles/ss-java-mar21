/**
 * 
 */
package com.ss.wk1.d1.guessrng;

/**
 * Utility class for RNG guessing game.
 * @author Christian Angeles
 */
public class GuessRngUtil {
	private static int chances = 0;
	private static boolean winState = false;
	/**
	 * Checks if user number is between +/-10 of the random number.
	 * @param userNum
	 * @param randNum
	 */
	public static void checkNum(int userNum, int randNum) {
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
			winState = true;
		}
		else {
			System.out.println("Your guess must be between " + randNumLow + " and " + randNumHigh + ".");
			chances = chances + 1;
		}
	}
	/**
	 * Returns user's number of chances left to play.
	 * @return
	 */
	public static int getChances() {
		return chances;
	}
	/**
	 * Returns true if user wins.
	 * @return
	 */
	public static boolean isWinner() {
		return winState;
	}
}
