/**
 * 
 */
package com.ss.wk1.d4.doublechecked;

/**
 * @author Christian Angeles
 */
public class Singleton {
	
	private static Singleton instance = null;
	
	private Singleton() {}
	/**
	 * 
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
