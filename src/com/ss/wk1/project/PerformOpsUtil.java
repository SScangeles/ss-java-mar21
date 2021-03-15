/**
 * 
 */
package com.ss.wk1.project;

/**
 * @author Christian Angeles
 *
 */
public class PerformOpsUtil {
	/**
	 * 
	 * @param num
	 * @return
	 */
	public PerformOpsFI isOdd(Integer num) {
		return () -> {
			return (num % 2) > 0;
		};
	}
	/**
	 * 
	 * @param num
	 * @return
	 */
	public PerformOpsFI isPrime(Integer num) {
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
	/**
	 * 
	 * @param num
	 * @return
	 */
	public PerformOpsFI isPalindrome(Integer num) {
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
