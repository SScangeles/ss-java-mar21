/**
 * 
 */
package com.ss.wk1.d3.listdirectory;

import com.ss.wk1.d3.charcount.FileOperations;
import com.ss.wk1.d1.guessrng.ConsoleUserInput;

/**
 * Week 1, Day 3 - List file/directory names of a specific path.
 * @author Christian Angeles
 */
public class ListDirectory {
	private FileOperations fileOps;
	private ConsoleUserInput userIn;
	
	public ListDirectory() {
		fileOps = new FileOperations();
		userIn = new ConsoleUserInput();
	}
	/**
	 * Starts list directory project.
	 */
	public void start() {
		System.out.print("Enter path to list: ");
		userIn.setInput();
		try {
			for(String filenames: fileOps.listFileDir(userIn.getInput().toString())) {
				System.out.println(filenames);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
