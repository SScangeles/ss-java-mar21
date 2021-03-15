/**
 * 
 */
package com.ss.wk1.d5.lambda;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

/**
 * @author Christian Angeles
 *
 */
public class DateTime {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		System.out.println(date.getMonth()+" "+date.getDayOfMonth()+", "+date.getYear());

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
		LocalTime time = LocalTime.now();
		System.out.println("PST: "+time.format(dtf));

		DateTimeFormatter zdtf = DateTimeFormatter.ofPattern("hh:mm");
		ZonedDateTime zdt = ZonedDateTime.now();
//		ZoneId est = ZoneId.of("UTC-4");
		ZoneId est = TimeZone.getTimeZone("America/New_York").toZoneId();
		System.out.println("EST: "+zdt.withZoneSameInstant(est).format(zdtf));
		
		DateTimeFormatter strFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		String dtStr = zdt.withZoneSameInstant(est).format(strFormat).toString();
		System.out.println(dtStr);
		
	}
}
