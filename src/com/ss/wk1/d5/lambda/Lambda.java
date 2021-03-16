/**
 * 
 */
package com.ss.wk1.d5.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Christian Angeles
 */
public class Lambda {
	private LambdaUtil lambUtil;
	
	public Lambda() {
		lambUtil = new LambdaUtil();
	}
	/**
	 * Returns a sorted list from shortest to longest string length.
	 * @return
	 */
	public List<String> sortLenShortLong(List<String> list) {
		if(list == null)
			return new ArrayList<String>();
		List<String> strList = list;
		Collections.sort(strList, (pivStr, midStr) -> pivStr.length() - midStr.length());
		return strList;
	}
	/**
	 * Returns a sorted list from longest to shortest string length.
	 * @return
	 */
	public List<String> sortLenLongShort(List<String> list) {
		if(list == null)
			return new ArrayList<String>();
		List<String> strList = list;
		Collections.sort(strList, (pivStr, midStr) -> midStr.length() - pivStr.length());
		return strList;
	}
	/**
	 * Returns an alphabetically sorted list of strings.
	 * @return
	 */
	public List<String> sortAlphabet(List<String> list) {
		if(list == null)
			return new ArrayList<String>();
		List<String> strList = list;
		Collections.sort(strList, (pivStr, midStr) -> pivStr.charAt(0) - midStr.charAt(0));
		return strList;
	}
	/**
	 * Returns a sorted list where strings starting an 'e' is first.
	 * @return
	 */
	public List<String> sortEFirst(List<String> list) {
		if(list == null)
			return new ArrayList<String>();
		List<String> strList = list;
		Collections.sort(strList, (pivStr, midStr) -> {
			if(pivStr.charAt(0) == 'e') {
				return -1;
			}
			return 0;
		});
		return strList;
	}
	/**
	 * Returns a sorted list where strings starting an 'e' is first.
	 * @return
	 */
	public List<String> sortEFirstUtil(List<String> list){
		if(list == null)
			return new ArrayList<String>();
		List<String> strList = list;
		Collections.sort(strList, (pivStr, midStr) -> lambUtil.sortEFirstUtil(pivStr));
		return strList;
	}
}
