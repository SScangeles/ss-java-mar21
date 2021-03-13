/**
 * 
 */
package com.ss.wk1.d4.produceconsumer;

/**
 * Consumer class to consume items from a bound buffered list.
 * @author Christian Angeles
 */
public class Consumer implements Runnable {
	private ListBuffer lb;
	
	public Consumer(ListBuffer listBuff) {
		lb = listBuff;
	}

	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; ++i) {
				Thread.sleep(200);
				System.out.println(lb.getListItem());
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
