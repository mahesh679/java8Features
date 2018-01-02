package com.nisum;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateExample1 {
	 public static void main(String[] args) {  
		    LocalDate date = LocalDate.now();  
		    LocalDate yesterday = date.minusDays(1);  
		    LocalDate tomorrow = yesterday.plusDays(2);  
		    System.out.println("Today date: "+date);  
		    System.out.println("Yesterday date: "+yesterday);  
		    System.out.println("Tommorow date: "+tomorrow);  
		    
		    
		    
		    
		    //Check given year is leap year of not
		    
		    LocalDate date1 = LocalDate.of(2017, 1, 13);  
		    System.out.println(date1.isLeapYear());  
		    LocalDate date2 = LocalDate.of(2016, 9, 23);  
		    System.out.println(date2.isLeapYear());  
		    
		    
		    
		    //Set our own date and time
		    LocalDate date3 = LocalDate.of(2017, 1, 13);  
		    LocalDateTime datetime = date3.atTime(1,50,9);      
		    System.out.println(datetime);   
		  }  
}
