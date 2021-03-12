/**
 * 
 */
package com.ss.wk1.d4.doublechecked;

/**
 * @author Christian Angeles
 *
 */
public class DoubleChecked {
	
	public boolean start() {
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				try {
					Singleton.getInstance("Thread 1");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("Thread 1 complete.");
			}
		};
		
		Runnable t2 = new Runnable() {
			@Override
			public void run() {
				try {
					Singleton.getInstance("Thread 2");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				System.out.println("Thread 2 complete.");
			}
		};
		
		new Thread(t1).start();
		new Thread(t2).start();
		return true;
	}
}
