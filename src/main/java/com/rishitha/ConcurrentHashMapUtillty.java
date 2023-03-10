package com.rishitha;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapUtillty {
	 public static void main(String[] args)
	    {
	        ConcurrentHashMap<Integer, String> m  = new ConcurrentHashMap<Integer, String>();
	        m.put(100, "Hello");// Insert mappings using put method
	        m.put(101, "Hi");
	        m.put(102, "Hi");
	 
	        // Here we can't add Hello because 101 key is already present in ConcurrentHashMap object
	        m.putIfAbsent(101, "Hello");
	 
	        // We can remove entry because 101 key is associated with For value
	        m.remove(101, "Hi");
	        
	        // Now we can add Hello
	        m.putIfAbsent(103, "Hello");
	 
	        // We can't replace Hello with For
	        m.replace(101, "Hello", "For");
	        System.out.println(m);
	    
	            // Creating ConcurrentHashMap
	            Map<String, String> my_cmmap = new ConcurrentHashMap<String, String>();
	     
	            // Adding elements to the map using put() method
	            my_cmmap.put("1", "10");
	            my_cmmap.put("2", "11");
	            my_cmmap.put("3", "12");
	            my_cmmap.put("4", "13");
	            my_cmmap.put("5", "14");
	            my_cmmap.put("6", "15");
	     
	           
	            System.out.println("Map: " + my_cmmap);  // Printing the map
	            System.out.println();
	     
	            // Removing the mapping with existing key 6 using remove() method
	            String valueRemoved = my_cmmap.remove("6");
	            
	            // Printing the map after remove()
	            System.out.println("After removing mapping with key 6:");
	            System.out.println("Map: " + my_cmmap);
	            System.out.println("Value removed: " + valueRemoved);
	            System.out.println();
	     
	            // Removing the mapping with non-existing key 10 using remove() method
	            valueRemoved = my_cmmap.remove("10");
	            
	            // Printing the map after remove()
	            System.out.println("After removing mapping with key 10:"); 
	            System.out.println("Map: " + my_cmmap);
	            System.out.println("Value removed: " + valueRemoved);
	           
	            // Display the value of 4
	            System.out.println("The Value associated to " + "100 is : " + my_cmmap.get(4));
	            // Getting the value of 5
	            System.out.println("The Value associated to " + "103 is : " +my_cmmap.get(5));
	            // Now clear the map using clear()
	            my_cmmap.clear();
	     
	            // Print the clear Map
	            System.out.println("Map after use of clear(): " + my_cmmap);
    }
	    }

