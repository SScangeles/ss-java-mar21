/**
 * 
 */
package com.ss.wk1.d5.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Christian Angeles
 */
public class Lambda {
	
	private List<String> strList;
	
	public Lambda () {
		strList = new ArrayList<>(Arrays.asList("pikachu", "charzard", "exeggcute", "abbra", "eevee", "snorlax", "electrode"));
	}
	
	public void start() {
		String[] test = {"pikachu", "charzard", "exeggcute", "abbra", "eevee", "snorlax", "electrode"};
		Arrays.sort(strList.toArray());
	}
}
