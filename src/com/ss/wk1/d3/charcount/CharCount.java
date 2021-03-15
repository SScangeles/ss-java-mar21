/**
 * 
 */
package com.ss.wk1.d3.charcount;

import com.ss.wk1.d1.guessrng.ConsoleUserInput;

/**
 * Week 1, Day 3 - Count character in a text file.
 * @author Christian Angeles
 */
public class CharCount {
	private ConsoleUserInput userIn;
	private int charCount;
	
	public CharCount() {
		super();
		userIn = new ConsoleUserInput();
		charCount = 0;
	}
	/**
	 * Starts character count project.
	 */
	public void start() {
		FileOperations fileOps = new FileOperations();
		System.out.print("Enter character to count: ");
		userIn.setInput();
		try {
			charCount = fileOps.countChar("resources/in/Lorem.txt", userIn.getInput().toString());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Character count: "+charCount);
	}
}
