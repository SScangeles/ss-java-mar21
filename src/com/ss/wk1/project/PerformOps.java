/**
 * 
 */
package com.ss.wk1.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Christian Angeles
 *
 */
public class PerformOps {
	
	private PerformOps() {}

	public static PerformOpsFI isOdd(Integer num) {
		return () -> {
			return (num % 2) > 0;
		};
	}
	
	public static PerformOpsFI isPrime(Integer num) {
		return () -> {
			if(num < 2) {
				return false;
			}
			else {
				for(int i = 2; i < num; ++i) {
					if(num % i <= 0) {
						return false;
					}
				}
				return true;
			}
		};
	}
	
	public static PerformOpsFI isPalindrome(Integer num) {
		return () -> {
			StringBuilder temp = new StringBuilder();
			temp.append(num.toString());
			temp.reverse();
			if(temp.toString().equals(num.toString())) {
				return true;
			}
			return false;
		};
	}
}
