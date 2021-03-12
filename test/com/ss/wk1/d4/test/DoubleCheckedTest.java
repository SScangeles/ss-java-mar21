/**
 * 
 */
package com.ss.wk1.d4.test;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.ss.wk1.d4.doublechecked.DoubleChecked;

/**
 * @author Christian Angeles
 *
 */
public class DoubleCheckedTest {
	private DoubleChecked dc = new DoubleChecked();
	
	@Test
	public void startTest() {
		assertTrue(dc.start());
	}
}
