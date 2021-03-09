package com.ss.wk1.d1.patterns;
/**
 * Class to print the different patterns.
 * @author Christian Angeles
 */
public class MakePatterns {
	/**
	 * Input the pattern number to display.
	 * @param patternNum
	 */
	public void printPattern(int patternNum) {

		System.out.println(patternNum + ")");
		
		switch(patternNum) {
		case 1:
			PatternsUtil.patternOne();
			System.out.println("......");
			break;
		case 2:
			PatternsUtil.patternTwo();
			System.out.println(".....");
			break;
		case 3:
			System.out.println(".....");
			PatternsUtil.patternThree();
			break;
		}

		System.out.println();
	}
}
