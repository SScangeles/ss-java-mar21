/**
 * 
 */
package com.ss.wk1.d5.lambda;

import java.time.*;

/**
 * @author Christian Angeles
 *
 */
public class DateTime {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getMonth());
		
		LocalTime time = LocalTime.now();
		System.out.println(time.getHour()+":"+time.getMinute());
	}
}
