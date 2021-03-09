package com.ss.wk1.d1;
/**
 * Class to print four different patterns.
 * @author Christian Angeles
 *
 */
public class MakePatterns {
	private String dash;
	/**
	 * Input the pattern number to display.
	 * @param patternNum
	 */
	public void printPattern(int patternNum) {
		dash = "--------";
		for(int i = 0; i < patternNum; ++i)
			dash = dash.concat("-");

		System.out.println(patternNum + ")");
		
		switch(patternNum) {
		case 1:
			PatternUtil.patternOne();
			System.out.println(dash);
			break;
		case 2:
			System.out.println(dash);
			PatternUtil.patternTwo();
			break;
		case 3:
			PatternUtil.patternThree();
			System.out.println(dash);
			break;
		case 4:
			System.out.println(dash);
			PatternUtil.patternFour();
			break;
		}

		System.out.println();
	}
}
