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
		MakePatternsUtil patternsUtil = new MakePatternsUtil();

		System.out.println(patternNum + ")");
		
		switch(patternNum) {
		case 1:
			patternsUtil.patternOne();
			System.out.println("......");
			break;
		case 2:
			patternsUtil.patternTwo();
			System.out.println(".....");
			break;
		case 3:
			System.out.println(".....");
			patternsUtil.patternThree();
			break;
		}

		System.out.println();
	}
}
