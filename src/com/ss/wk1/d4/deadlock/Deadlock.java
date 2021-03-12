/**
 * 
 */
package com.ss.wk1.d4.deadlock;

/**
 * @author Christian Angeles
 */
public class Deadlock {
	private Integer firstNum, secondNum;
	
	public Deadlock() {
		firstNum = 1;
		secondNum = 2;
	}
	/**
	 * 
	 * @return
	 */
	public boolean start() {
		startNewThread("Thread 1", firstNum, secondNum);
		startNewThread("Thread 2", secondNum, firstNum);
		return true;
	}
	/**
	 * 
	 * @param threadName
	 * @param firstInt
	 * @param secondInt
	 * @return
	 */
	public boolean startNewThread(String threadName, Integer firstInt, Integer secondInt) {
		Runnable t1 = new Runnable() {
			@Override
			public void run() {
				try {
					synchronized(firstInt) {
						Thread.sleep(1000);
						synchronized(secondInt) {
							System.out.println(threadName+" accessed critical section!");
						}
					}
				}
				catch(Exception e) {
					e.printStackTrace();
				}
			}
		};
		new Thread(t1).start();
		System.out.println(threadName+" complete.");
		return true;
	}
}
