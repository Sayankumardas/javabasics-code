package com.example.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/*
 * java.util.Date
 * java.util.Calendar
 * 
 * but the above two classes are not thread safe
 * additional logic was required to handle time-zone logic
 * 
 * but new java.time -> it manages all of it on its own
 * 
 * Most important classes:
 * Local: -> no complexity of handling time-zone
 * Zoned: -> deal various time-zones
 * 
 * */


public class JavaDateTimeMain {
	
	
	public static void main(String[] args) {
		
		/*
		 * LocalDate: represents date in (yyyy-MM-dd) format -> ISO without time
		 * 
		 * */
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		localDate = LocalDate.of(2021, 10, 21);
		System.out.println(localDate);
		
		System.out.println("Input Date in yyyy-MM-dd format:");
		Scanner input = new Scanner(System.in);
		String date = input.next();
		
		localDate = LocalDate.parse(date);
		System.out.println(localDate+" "+localDate.getClass());
		
		/*
		 * 
		 * LocalDate: Adding relationships between date
		 * 
		 * */
		
		
		boolean notBefore = LocalDate.parse("2016-06-12").isBefore(LocalDate.parse("2016-06-11"));
		System.out.println(notBefore);
		
		boolean isAfter =  LocalDate.parse("2016-06-12").isAfter(LocalDate.parse("2016-06-11"));
		System.out.println(isAfter);
		
		
		
		
		
		/*
		 * 
		 * LocalTime: It will show the time
		 * 
		 * */
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		System.out.println("Input time in format: HH:mm:ss");
		String time = input.next();
		
		
		localTime = LocalTime.parse(time, DateTimeFormatter.ofPattern("HH:mm:ss"));
		
		System.out.println(localTime);
		
		
		
		/*
		 * 
		 * LocalDateTime: It will shoe both date and time
		 * 
		 * */
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 06, 30);
		System.out.println(localDateTime);
		
		System.out.println(LocalDateTime.parse("2015-02-20T06:30:00"));
		
		
		
	}

}
