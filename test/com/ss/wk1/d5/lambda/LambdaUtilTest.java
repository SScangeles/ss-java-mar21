/**
 * 
 */
package com.ss.wk1.d5.lambda;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * @author Christian Angeles
 *
 */
public class LambdaUtilTest {
	private Integer expectNum;
	
	@Test
	public void sortEFirstUtilTest() {
		//if string's first character is an 'e' expect -1
		expectNum = -1;
		assertEquals(expectNum, LambdaUtil.sortEFirstUtil("e"));
		
		//if string's first character is not an 'e' expect 0
		expectNum = 0;
		assertEquals(expectNum, LambdaUtil.sortEFirstUtil("a"));
	}
}
