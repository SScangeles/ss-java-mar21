/**
 * 
 */
package com.ss.wk1.d2.addvalues;

/**
 * UserValues class holds the result of the added values.
 * @author Christian Angeles
 */
public class UserValues {
	private Integer result;
	/**
	 * Adds user's input values.
	 * @param userInput
	 * @throws Exception
	 */
	public void addUserInput(String[] userInput) throws Exception {
		result = 0;
		for(String numStr: userInput) {
			result += Integer.parseInt(numStr);
		}
	}
	/**
	 * Returns added result.
	 * @return
	 */
	public Integer getResult() {
		return result;
	}
}
