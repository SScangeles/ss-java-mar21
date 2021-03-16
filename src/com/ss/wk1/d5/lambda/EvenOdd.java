/**
 * 
 */
package com.ss.wk1.d5.lambda;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Christian Angeles
 *
 */
public class EvenOdd {
	/**
	 * Returns a string marking odd numbers with 'o' and even numbers with 'e'.
	 * @param numList
	 * @return
	 */
	public String numListToString(List<Integer> numList) {
		if(numList==null) {
			return "";
		}
		List<Integer> list = numList;
		return list.stream().map( (num) -> {
			if(num % 2 > 0) {
				return "o" + String.valueOf(num);
			}
			else {
				return "e" + String.valueOf(num);
			}
		}).collect(Collectors.joining(",", "'", "'"));
	}
}
