package com.rishitha;
import java.util.*;
public class TreesetUtilty {
	public static void main(String args[])
	{
		Set<String> ts = new TreeSet<String>();
		ts.add("A");  // Elements are added using add() method
        ts.add("Rishi");
        ts.add("C");
        ts.add("Intern");
        ts.add("cse");
 
        // Duplicates will not get insert
        ts.add("C");
         System.out.println(ts);// Elements get stored in default natura,Sorting Order(Ascending)
         
         
         String check = "Rishi";
         System.out.println("Contains " + check + " " + ts.contains(check)); // Check if the above string exists in the treeset or not
         System.out.println("First Value " + ((TreeSet<String>) ts).first()); // Print the first element
         System.out.println("Last Value " + ((TreeSet<String>) ts).last()); // Print the last element
        
         String val = "Rishi";
        // Find the values just greater & smaller than the above string
        System.out.println("Higher " + ((TreeSet<String>) ts).higher(val));
        System.out.println("Lower " + ((TreeSet<String>) ts).lower(val));
        
        ts.remove("C");
        for (String value : ts)
        	 
            // Printing the values inside the object
            System.out.print(value + ", ");
        
        ((TreeSet<String>) ts).pollFirst(); // Removing the first element using pollLast() method
        // Again printing the updated TreeSet
        System.out.println("After removing first " + ts);
 
        ((TreeSet<String>) ts).pollLast(); // Removing the last element using pollLast() method
        // Again printing the updated TreeSet
        System.out.println("After removing last " + ts);
        
	}
}



