/**
 * 
 */
package com.ss.wk1.d4.deadlock;

/**
 * Week 1, Day 4 - Deadlock
 * @author Christian Angeles
 */
public class Deadlock {
	private Integer firstNum, secondNum;
	
	public Deadlock() {
		firstNum = 1;
		secondNum = 2;
	}
	/**
	 * Starts deadlock project.
	 */
	public void start() {
		startNewThread("Thread 1", firstNum, secondNum);
		startNewThread("Thread 2", secondNum, firstNum);
	}
	/**
	 * Starts a new thread for deadlock project. Input thread's name for console output purposes.
	 * Input two integer objects to be locked by a particular thread.
	 * @param threadName
	 * @param firstInt
	 * @param secondInt
	 */
	public void startNewThread(String threadName, Integer firstInt, Integer secondInt) {
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
	}
}
