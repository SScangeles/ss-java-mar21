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
	private FileOperations file;
	private int charCount;
	
	public CharCount() {
		super();
		userIn = new ConsoleUserInput();
		file = new FileOperations();
		charCount = 0;
	}
	/**
	 * Starts character count project.
	 */
	public void start() {
		System.out.print("Enter character to count: ");
		userIn.setInput();
		charCount = file.countChar("resources/in/Lorems.txt", userIn.getInput().toString());
		System.out.println("Character count: "+charCount);
	}
}
