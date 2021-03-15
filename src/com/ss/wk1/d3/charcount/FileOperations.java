/**
 * 
 */
package com.ss.wk1.d3.charcount;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Class to perform fileIO related operations.
 * @author Christian Angeles
 */
public class FileOperations {
	
	private FileOperations() {}
	/**
	 * Counts the number of time a character appears in a file. Returns character count.
	 * @param filePathName
	 * @param letter
	 * @return
	 */
	public static Integer countChar(String filePathName, String letter) throws IOException {
		int charCount = 0;
		
		try(FileInputStream fileIn = new FileInputStream(filePathName)){
			int charByte;
			while((charByte = fileIn.read()) != -1) {
				if(charByte == letter.getBytes()[0]) {
					charCount += 1;
				}
			}
		}
		return charCount;
	}
	/**
	 * Append text to a text file.
	 * @param filePathName
	 * @param addText
	 */
	public static void appendToFile(String filePathName, String addText) throws IOException {
		try(FileWriter fileWrite = new FileWriter(filePathName, true)){
			fileWrite.append(addText);
		}
	}
	/**
	 * Returns list of strings of the file/directory names of given path.
	 * @param path
	 * @return
	 */
	public static List<String> listFileDir(String path) {
		File dir = new File(path);
		List<String> list = new ArrayList<>();
		
		if(dir.list() != null && dir.list().length > 0 ) {
			for(int i = 0; i < dir.list().length; ++i) {
				list.addAll(listFileDir(dir.getPath()+"\\"+dir.list()[i]));
			}
		}
		else {
			list.add(dir.getPath());
		}
		return list;
	}
	/**
	 * 
	 * @param filePathName
	 * @return
	 * @throws Exception
	 */
	public static List<String> getFileContents(String filePathName) throws Exception {
		List<String> tempListStr = new ArrayList<>();
		try(FileInputStream fileIn = new FileInputStream(filePathName);
				BufferedReader buffRead = new BufferedReader(new InputStreamReader(fileIn));){
			String tempStr = buffRead.readLine();
			while(tempStr != null) {
				tempListStr.add(tempStr.toString());
				tempStr = buffRead.readLine();
			}
		}
		
		return tempListStr;
	}
}
