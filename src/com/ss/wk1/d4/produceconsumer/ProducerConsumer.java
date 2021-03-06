/**
 * 
 */
package com.ss.wk1.d4.produceconsumer;

/**
 * Week 1, Day 4 - Producer-Consumer problem.
 * @author Christian Angeles
 */
public class ProducerConsumer {
	private ListBuffer listBuff;
	private Consumer consume;
	private Producer produce;
	
	public ProducerConsumer() {
		listBuff = new ListBuffer(3);
		consume = new Consumer(listBuff);
		produce = new Producer(listBuff);
	}
	/**
	 * Starts producer-consumer project.
	 */
	public void start() {
		new Thread(consume).start();
		new Thread(produce).start();
	}
}
