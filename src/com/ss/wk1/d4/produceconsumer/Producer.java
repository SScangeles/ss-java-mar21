/**
 * 
 */
package com.ss.wk1.d4.produceconsumer;

/**
 * @author Christian Angeles
 *
 */
public class Producer implements Runnable {
	private ListBuffer lb;
	
	public Producer(ListBuffer listBuff) {
		lb = listBuff;
	}

	@Override
	public void run() {
		try {
			lb.getListBuff().offer(1);
			Thread.sleep(500);
			lb.getListBuff().offer(2);
			Thread.sleep(500);
			lb.getListBuff().offer(3);
			Thread.sleep(500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
