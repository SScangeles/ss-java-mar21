/**
 * 
 */
package com.ss.wk1.d4.produceconsumer;

/**
 * @author Christian Angeles
 *
 */
public class Consumer implements Runnable {
	private ListBuffer lb;
	
	public Consumer(ListBuffer listBuff) {
		lb = listBuff;
	}

	@Override
	public void run() {
		try {
			System.out.println(lb.getListBuff().poll());
			Thread.sleep(500);
			System.out.println(lb.getListBuff().poll());
			Thread.sleep(500);
			System.out.println(lb.getListBuff().poll());
			Thread.sleep(500);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
