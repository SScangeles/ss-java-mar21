/**
 * 
 */
package com.ss.wk1.project;

import java.util.ArrayList;
import java.util.List;

import com.ss.wk1.d3.charcount.FileOperations;

/**
 * @author Christian Angeles
 *
 */
public class PerformOps {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		try {
			list = FileOperations.getFileContents("resources/in/performOpsInput.txt");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		int row = Integer.parseInt(list.get(0).toString());
		for(int i = 1; i <= row; ++i) {
			int func = Integer.parseInt(list.get(i).toString().split(" ")[0]);
			int num = Integer.parseInt(list.get(i).toString().split(" ")[1]);
			getFunc(func, num);
		}
	}
	/**
	 * 
	 * @param func
	 * @param num
	 */
	public static void getFunc(Integer func, Integer num) {
		switch(func) {
		case 1:
			if(PerformOpsUtil.isOdd(num).check()) {
				System.out.println("ODD");
			}
			else {
				System.out.println("EVEN");
			}
			break;
		case 2:
			if(PerformOpsUtil.isPrime(num).check()) {
				System.out.println("PRIME");
			}
			else {
				System.out.println("COMPOSITE");
			}
			break;
		case 3:
			if(PerformOpsUtil.isPalindrome(num).check()) {
				System.out.println("PALINDROME");
			}
			else {
				System.out.println("!PALINDROME");
			}
			break;
		default:
			break;
		}
	}
}
