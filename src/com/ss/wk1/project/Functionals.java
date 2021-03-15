/**
 * 
 */
package com.ss.wk1.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Christian Angeles
 *
 */
public class Functionals {
	
	private Functionals() {}
	/**
	 * 
	 * @param listPosNum
	 * @return
	 */
	public static List<Integer> rightDigit(List<Integer> listPosNum){
		if(listPosNum == null)
			return new ArrayList<Integer>(Arrays.asList());
		return listPosNum.stream().map((num) -> num % 10).collect(Collectors.toList());
	}
	/**
	 * 
	 * @param listNum
	 * @return
	 */
	public static List<Integer> doubling(List<Integer> listNum){
		if(listNum == null)
			return new ArrayList<Integer>(Arrays.asList());
		return listNum.stream().map((num) -> num * 2).collect(Collectors.toList());
	}
	/**
	 * 
	 * @param listStr
	 * @return
	 */
	public static List<String> noX(List<String> listStr){
		if(listStr == null)
			return new ArrayList<String>(Arrays.asList());
		return listStr.stream().map((str)-> {
			StringBuilder temp = new StringBuilder();
			for(char c: str.toCharArray()) {
				if(c != 'x') {
					temp.append(c);
				}
			}
			return temp.toString();
		}).collect(Collectors.toList());
	}
}
