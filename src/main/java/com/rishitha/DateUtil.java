package com.rishitha;
import java.util.*;
import java.text.DateFormat;

public class DateUtil {

public static void main(String[] args) {

      // create 2 dates
      Date dt1 = new Date(2017, 3, 31); 
      Date dt2 = new Date(2017, 5, 14);
      Calendar cl= Calendar.getInstance();
          
      // Check if dt1 is  after dt2
      boolean result =  dt1.after(dt2);
      System.out.println("Date1 is after date2: " + result);
      // Check if dt2 is  after dt1
      result = dt2.after(dt1);
      System.out.println("Date2 is after date1: " + result);
      
      int comparison=dt1.compareTo(dt2); 
      System.out.println("Your comparison value is : "+comparison);  
      cl.add(Calendar.DAY_OF_MONTH, -5); 
      System.out.println(cl.getTime());
      System.out.println("substracting 5days from the calendar"+cl.getTime());
      
      Calendar calendar = Calendar.getInstance();
     // String currentDate = Date.format(calendar.getTime()); //format() method for conversion
	  //System.out.println("Formatted Date: " + currentDate);
		System.out.println(calendar.getTime());
		System.out.println(" No of days in month"+calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		
      /*public abstract void add(int field,int amount) {
  		
  	}  	   
     public boolean after(Date dt1)
      {
    	  return result;
      }**/
   }
}

