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
	private PerformOpsUtil pOpsUtil = new PerformOpsUtil();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FileOperations fileOps = new FileOperations();
		PerformOps pOps = new PerformOps();
		List<String> list = new ArrayList<>();
		
		try {
			list = fileOps.getFileContents("resources/in/performOpsInput.txt");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		int row = Integer.parseInt(list.get(0).toString());
		for(int i = 1; i <= row; ++i) {
			int func = Integer.parseInt(list.get(i).toString().split(" ")[0]);
			int num = Integer.parseInt(list.get(i).toString().split(" ")[1]);
			pOps.getFunc(func, num);
		}
	}
	/**
	 * Driver function for PerformOps.
	 * @param func
	 * @param num
	 */
	public void getFunc(Integer func, Integer num) {
		switch(func) {
		case 1:
			if(pOpsUtil.isOdd(num).check()) {
				System.out.println("ODD");
			}
			else {
				System.out.println("EVEN");
			}
			break;
		case 2:
			if(pOpsUtil.isPrime(num).check()) {
				System.out.println("PRIME");
			}
			else {
				System.out.println("COMPOSITE");
			}
			break;
		case 3:
			if(pOpsUtil.isPalindrome(num).check()) {
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
