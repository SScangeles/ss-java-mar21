/**
 * 
 */
package com.ss.wk1.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

/**
 * @author Christian Angeles
 *
 */
public class Functionals {
	
	private Functionals() {}
	
	public static List<Integer> rightDigit(List<Integer> listPosNum){
		return listPosNum.stream().map((num) -> num % 10).collect(Collectors.toList());
	}
	
	public static List<Integer> doubling(List<Integer> listNum){
		return listNum.stream().map((num) -> num * 2).collect(Collectors.toList());
	}
	
	public static List<String> noX(List<String> listStr){
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
