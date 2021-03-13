/**
 * 
 */
package com.ss.wk1.d4.produceconsumer;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * ListBuffer class holds items for producer and consumer threads.
 * @author Christian Angeles
 */
public class ListBuffer {
	
	private ArrayBlockingQueue<Integer> listBuff;
	
	public ListBuffer(Integer buffSize) {
		listBuff = new ArrayBlockingQueue<>(buffSize);
	}
	/**
	 * Returns an item from the buffered list.
	 * @return
	 */
	public Integer getListItem() {
		Integer item = null;
		if(!listBuff.isEmpty()) {
			synchronized(listBuff) {
				if(!listBuff.isEmpty()) {
					item = listBuff.poll();
				}
			}
		}
		return item;
	}
	/**
	 * Input an item for the buffered list.
	 * @param item
	 */
	public void setListItem(Integer item) {
		if(listBuff.isEmpty()) {
			synchronized(listBuff) {
				if(listBuff.isEmpty()) {
					listBuff.offer(item);
				}
			}
		}
	}
}
