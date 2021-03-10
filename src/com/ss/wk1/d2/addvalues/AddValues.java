/**
 * 
 */
package com.ss.wk1.d2.addvalues;

import java.util.Scanner;

/**
 * Week 1, Day 2 - Add multiple user input values.
 * @author Christian Angeles
 */
public class AddValues {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		UserValues userVal = new UserValues();
		
		System.out.print("Enter integer values to add: ");
		try {
			userVal.addUserInput(inputScanner.nextLine().split(" "));
			System.out.println("Result = "+userVal.getResult());
		}
		catch(Exception e) {
			System.out.println("Not a valid input.");
		}
		finally {
			inputScanner.close();
		}
	}

}
