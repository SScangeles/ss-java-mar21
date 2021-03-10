/**
 * 
 */
package com.ss.wk1.d1.guessrng;

import java.util.Scanner;

/**
 * Creates StringBuilder object for console input.
 * @author Christian Angeles
 */
public class ConsoleUserInput {
	private Scanner inScan;
	private StringBuilder input;
	/**
	 * Initialze Scanner and StringBuilder objects.
	 */
	public ConsoleUserInput() {
		inScan = new Scanner(System.in);
		input = new StringBuilder();
	}
	/**
	 * Ask user for input in console.
	 */
	public void setInput() {
		input.setLength(0);
		input.append(inScan.nextLine());
	}
	/**
	 * Returns user input as StringBuilder object.
	 * @return
	 */
	public StringBuilder getInput() {
		return input;
	}
}
