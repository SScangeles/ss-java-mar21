/**
 * 
 */
package com.ss.wk1.project;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Christian Angeles
 *
 */
public class Functionals {
	/**
	 * Returns the right most digit of a list.
	 * @param listPosNum
	 * @return
	 */
	public List<Integer> rightDigit(List<Integer> listPosNum){
		if(listPosNum == null)
			return new ArrayList<Integer>();
		return listPosNum.stream().map((num) -> num % 10).collect(Collectors.toList());
	}
	/**
	 * Returns a doubled number list.
	 * @param listNum
	 * @return
	 */
	public List<Integer> doubling(List<Integer> listNum){
		if(listNum == null)
			return new ArrayList<Integer>();
		return listNum.stream().map((num) -> num * 2).collect(Collectors.toList());
	}
	/**
	 * Returns a list of strings with letter 'x' removed.
	 * @param listStr
	 * @return
	 */
	public List<String> noX(List<String> listStr){
		if(listStr == null)
			return new ArrayList<String>();
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
