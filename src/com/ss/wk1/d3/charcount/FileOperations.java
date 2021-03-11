/**
 * 
 */
package com.ss.wk1.d3.charcount;

import java.io.FileInputStream;

/**
 * @author Christian Angeles
 *
 */
public class FileOperations {
	/**
	 * Counts the number of time a character appears in a file.
	 * @param filePathName
	 * @param letter
	 * @return
	 */
	public Integer countChar(String filePathName, String letter) {
		int charCount = 0;
		
		try(FileInputStream fileIn = new FileInputStream(filePathName)){
			int charByte;
			while((charByte = fileIn.read()) != -1) {
				if(charByte == letter.getBytes()[0]) {
					charCount += 1;
				}
			}
		}
		catch(Exception e) {
			System.out.println("FileIO.countChar: "+e.getMessage());
			//e.printStackTrace();
		}
		
		return charCount;
	}
}
