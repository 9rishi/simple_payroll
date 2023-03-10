package com.rishitha;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Problem {
	public static void main(String[] args) {
		//Date d1;
	
		//Date  d1= '24-04-2022';
		//System.out.println(""+d1);
		Calendar cl = Calendar.getInstance();
		System.out.println(cl.getTime());
		
		
	cl.add(Calendar.DAY_OF_MONTH, -5); 
    System.out.println("substracting 5days from the calendar---->"+cl.getTime());
    DateFormat Date = DateFormat.getDateInstance();
 
    String currentDate = Date.format(cl.getTime()); //format() method for conversion
  System.out.println("Formatted Date: " + currentDate);
   
}
}