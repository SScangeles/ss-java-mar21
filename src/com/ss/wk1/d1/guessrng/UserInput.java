/**
 * 
 */
package com.ss.wk1.d1.guessrng;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * User input for RNG guessing game.
 * @author Christian Angeles
 */
public class UserInput {
	private Scanner inputScanner;
	private int userNum;
	/**
	 * Initialize variables: inputScanner, userNum
	 */
	public UserInput() {
		inputScanner = new Scanner(System.in);
		userNum = 0;
	}
	/**
	 * Ask the user for a number between 1-100.
	 * If the number is less than 1, number defaults to 1.
	 * If the number is greater than 100, number defaults to 100.
	 */
	public void askInput() {
		System.out.print("Enter your number (1-100): ");
		try {
			userNum = inputScanner.nextInt();
			if(userNum <= 0) {
				userNum = 1;
			}
			if(userNum > 100) {
				userNum =100;
			}
			System.out.println("Your number: " + userNum);
		}
		catch(InputMismatchException e) {
			System.out.println("Not a valid input.");
			inputScanner.next();
		}
	}
	/**
	 * Returns user input for userNum.
	 * @return
	 */
	public int getUserNum() {
		return userNum;
	}
}
