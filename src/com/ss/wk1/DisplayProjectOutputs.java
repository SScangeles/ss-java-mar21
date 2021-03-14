/**
 * 
 */
package com.ss.wk1;

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
import com.ss.wk1.d5.lambda.Lambda;

/**
 * Class used to display outputs for projects d1 to d4. 
 * @author Christian Angeles
 */
public class DisplayProjectOutputs {

	public static void main(String[] args) {
//		GuessRng grng = new GuessRng();
//		Patterns pat = new Patterns();
//		AddValues addval = new AddValues();
//		MaxNumber maxnum = new MaxNumber();
//		Shapes shapes = new Shapes();
//		CharCount charcount = new CharCount();
//		FileAppend fileapp = new FileAppend();
		ListDirectory listd = new ListDirectory();
//		DoubleChecked dcheck = new DoubleChecked();
//		Deadlock dlock = new Deadlock();
//		ProducerConsumer prodc = new ProducerConsumer();
		
		listd.start();
	}

}
