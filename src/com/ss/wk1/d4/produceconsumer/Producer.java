/**
 * 
 */
package com.ss.wk1.d4.produceconsumer;

/**
 * Producer class to produce items for a bound buffered list.
 * @author Christian Angeles
 */
public class Producer implements Runnable {
	private ListBuffer lb;
	
	public Producer(ListBuffer listBuff) {
		lb = listBuff;
	}

	@Override
	public void run() {
		try {
			for(int i = 0; i < 10; ++i) {
				lb.setListItem(i);
				Thread.sleep(250);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
