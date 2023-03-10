package com.rishitha;
import java.util.*;
import java.text.SimpleDateFormat;


public class WeekOfMonth {
	public static void main(String args[]) throws Exception {
		
	 Calendar calendar = Calendar.getInstance();
	 int n = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); 
	 System.out.println("Toatal no of days in this month:"+n);
	 int m = n%7;
	 System.out.println("There are"+n/7+" full weeks"+m +" and days in this month." );
	 System.out.println(""+calendar.getFirstDayOfWeek());
	 System.out.println(calendar.getTime());
	 calendar.setWeekDate(2021,6,2);
	 System.out.println(calendar.getTime());
	 System.out.println( calendar.getActualMaximum(Calendar.DAY_OF_MONTH));  // no of days
	 SimpleDateFormat sdf = new SimpleDateFormat("MMMMM");  // name of month
	 System.out.println(sdf.format(calendar.getTime()));
	 System.out.println(calendar.getTime());
	// System.out.println(calendar.roll(, 2));
}
}
