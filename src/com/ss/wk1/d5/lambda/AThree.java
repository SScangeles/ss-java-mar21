/**
 * 
 */
package com.ss.wk1.d5.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Christian Angeles
 *
 */
public class AThree {
	
	public AThree() {}
	/**
	 * 
	 * @param listStr
	 * @return
	 */
	public static List<String> threeLowerA(List<String> listStr) {
		if(listStr == null)
			return new ArrayList<String>(Arrays.asList());
		return listStr.stream().filter( (str) -> str.length() == 3 && str.toCharArray()[0] == 'a').collect(Collectors.toList());
	}
}
