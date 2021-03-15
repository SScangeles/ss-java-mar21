package com.ss.wk1.d1.patterns;
/**
 * Utility class with different algorithms for each pattern.
 * @author Christian Angeles
 */
public class MakePatternsUtil {
	/**
	 * Algorithm for pattern 1
	 */
	public void patternOne() {
		for(int i = 0; i < 4; ++i) {
			for(int j = 0; j <= i; ++j) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	/**
	 * Algorithm for pattern 2
	 */
	public void patternTwo() {
		for(int i = 0; i < 4; ++i) {
			String star = "*";
			String whiteSpace = "";
			for(int j = 0; j < i; ++j) {
				star = star.concat("*");
			}
			for(int k = 3; k > i; --k) {
				whiteSpace = whiteSpace.concat(" ");
			}
			System.out.println(whiteSpace + star);
		}
	}
	/**
	 * Algorithm for pattern 3
	 */
	public void patternThree() {
		for(int i = 4; i > 0; --i) {
			for(int j = 0; j < i; ++j) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	/**
	 * Algorithm for pattern 4
	 */
	public void patternFour() {
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
	/**
	 * Algorithm for pattern 5
	 */
	public void patternFive() {
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
