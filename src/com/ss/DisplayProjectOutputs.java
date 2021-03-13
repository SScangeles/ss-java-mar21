/**
 * 
 */
package com.ss;

import com.ss.wk1.d1.guessrng.GuessRng;
import com.ss.wk1.d1.patterns.Patterns;
import com.ss.wk1.d2.addvalues.AddValues;
import com.ss.wk1.d2.maxnumber.MaxNumber;
import com.ss.wk1.d2.shapes.Shapes;
import com.ss.wk1.d3.charcount.CharCount;
import com.ss.wk1.d3.fileappend.FileAppend;
import com.ss.wk1.d3.listdirectory.ListDirectory;
import com.ss.wk1.d4.doublechecked.DoubleChecked;
import com.ss.wk1.d4.deadlock.Deadlock;
import com.ss.wk1.d4.produceconsumer.ProducerConsumer;

/**
 * Class used to display outputs of projects. 
 * Note: Refactor some projects for re-usability
 * @author Christian Angeles
 */
public class DisplayProjectOutputs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		GuessRng gr = new GuessRng();
//		Patterns p = new Patterns();
//		AddValues av = new AddValues();
//		MaxNumber mn = new MaxNumber();
//		Shapes s = new Shapes();
//		CharCount cc = new CharCount();
//		FileAppend fa = new FileAppend();
//		ListDirectory ld = new ListDirectory();
//		DoubleChecked dc = new DoubleChecked();
//		Deadlock dl = new Deadlock();
		ProducerConsumer pc = new ProducerConsumer();
		
		pc.start();
	}

}
