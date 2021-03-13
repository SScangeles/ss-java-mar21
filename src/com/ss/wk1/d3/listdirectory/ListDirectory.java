/**
 * 
 */
package com.ss.wk1.d3.listdirectory;

import com.ss.wk1.d3.charcount.FileOperations;

import java.util.ArrayList;
import java.util.List;

import com.ss.wk1.d1.guessrng.ConsoleUserInput;

/**
 * Week 1, Day 3 - List file/directory names of a specific path.
 * @author Christian Angeles
 */
public class ListDirectory {
	private ConsoleUserInput userIn;
	private List<String> listDir;
	
	public ListDirectory() {
		userIn = new ConsoleUserInput();
		listDir = new ArrayList<>();
	}
	/**
	 * Starts list directory project.
	 */
	public void start() {
		System.out.print("Enter path to list: ");
		userIn.setInput();
		listDir = FileOperations.listFileDir(userIn.getInput().toString());

		for(String filename: listDir) {
			System.out.println(filename);
		}
	}
}
