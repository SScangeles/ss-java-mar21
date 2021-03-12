/**
 * 
 */
package com.ss.wk1.d4.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ss.wk1.d4.deadlock.Deadlock;

/**
 * @author Christian Angeles
 */
public class DeadlockTest {
	private Deadlock dl = new Deadlock();

	@Test
	public void startTest() {
		assertEquals(true, dl.start());
	}

	@Test
	public void startNewThreadTest() {
		assertEquals(true, dl.startNewThread("ThreadName", 1, 2));
	}
}
