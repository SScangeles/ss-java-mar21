/**
 * 
 */
package com.ss.wk1.d5.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Christian Angeles
 */
public class Lambda {
	/**
	 * 
	 * @return
	 */
	public List<String> sortLenShortLong(List<String> list) {
		if(list == null)
			return new ArrayList<String>(Arrays.asList());
		List<String> strList = list;
		Collections.sort(strList, (pivStr, midStr) -> pivStr.length() - midStr.length());
		return strList;
	}
	/**
	 * 
	 * @return
	 */
	public List<String> sortLenLongShort(List<String> list) {
		if(list == null)
			return new ArrayList<String>(Arrays.asList());
		List<String> strList = list;
		Collections.sort(strList, (pivStr, midStr) -> midStr.length() - pivStr.length());
		return strList;
	}
	/**
	 * 
	 * @return
	 */
	public List<String> sortAlphabet(List<String> list) {
		if(list == null)
			return new ArrayList<String>(Arrays.asList());
		List<String> strList = list;
		Collections.sort(strList, (pivStr, midStr) -> pivStr.charAt(0) - midStr.charAt(0));
		return strList;
	}
	/**
	 * 
	 * @return
	 */
	public List<String> sortEFirst(List<String> list) {
		if(list == null)
			return new ArrayList<String>(Arrays.asList());
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
	 * 
	 * @return
	 */
	public List<String> sortEFirstUtil(List<String> list){
		if(list == null)
			return new ArrayList<String>(Arrays.asList());
		List<String> strList = list;
		Collections.sort(strList, (pivStr, midStr) -> LambdaUtil.sortEFirstUtil(pivStr));
		return strList;
	}
}
