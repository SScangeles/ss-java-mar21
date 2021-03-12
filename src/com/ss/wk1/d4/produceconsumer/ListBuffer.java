/**
 * 
 */
package com.ss.wk1.d4.produceconsumer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author Christian Angeles
 */
public class ListBuffer {
	
	private ArrayBlockingQueue<Integer> listBuff;
	
	public ListBuffer(Integer buffSize) {
		listBuff = new ArrayBlockingQueue<>(buffSize);
	}

	public synchronized ArrayBlockingQueue<Integer> getListBuff() {
		return listBuff;
	}
}
