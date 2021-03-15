/**
 * 
 */
package com.ss.wk1.d5.lambda;

/**
 * @author Christian Angeles
 */
public class LambdaUtil {
	/**
	 * 
	 * @param str
	 * @return
	 */
	public Integer sortEFirstUtil(String str) {
		if(str==null) {
			return 0;
		}
		if(str.charAt(0) == 'e') {
			return -1;
		}
		return 0;
	}
}
