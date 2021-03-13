/**
 * 
 */
package com.ss.wk1.d4.doublechecked;

/**
 * Singleton class to be accessed by two threads.
 * @author Christian Angeles
 */
public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton() {}
	/**
	 * Returns the instance of the singleton object. Input thread name for console output purposes.
	 * @param threadName
	 * @return
	 */
	public static Singleton getInstance(String threadName) {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null ) {
					try {
						instance = new Singleton();
						System.out.println(threadName+" accessed critical section!");
						Thread.sleep(3000);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
				}
			}
		}
		return instance;
	}
}
