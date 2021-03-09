package com.ss.wk1.d1;
/**
 * Utility class with four different algorithms to print the patterns.
 * @author Christian Angeles
 *
 */
public class PatternUtil {
	
	public static void patternOne() {
		for(int i = 0; i < 4; ++i) {
			for(int j = 0; j <= i; ++j) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void patternTwo() {
		for(int i = 4; i > 0; --i) {
			for(int j = 0; j < i; ++j) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	public static void patternThree() {
		for(int i = 0; i < 4; ++i) {
			String star = " *";
			String whiteSpace = "";
			for(int j = 0; j < i; ++j) {
				star = star.concat("**");
			}
			for(int k = 4; k > i; --k) {
				whiteSpace = whiteSpace.concat(" ");
			}
			System.out.println(whiteSpace + star);
		}
	}
	
	public static void patternFour() {
		for(int i = 4; i > 0; --i) {
			String star = "  ";
			String whiteSpace = "";
			for(int j = 0; j < i; ++j) {
				star = star.concat("*");
			}
			for(int k = 1; k < i; ++k) {
				star = star.concat("*");
			}
			for(int l = 4; l > i; --l) {
				whiteSpace = whiteSpace.concat(" ");
			}
			System.out.println(whiteSpace + star);
		}
	}
}
