package com.rishitha;
import java.util.*; 

public class HashmapUtilty {
	 public static void main(String[] args)
	    {
	        HashMap<String, Integer> hmap = new HashMap<String, Integer>();
	 
	        // Adding elements to the Map using standard put() method
	        hmap.put("vishal", 10);
	        hmap.put("sachin", 30);
	        hmap.put("vaibhav", 20);
	        hmap.put("tiger", 50);
	 
	        System.out.println("Size of map is:" + hmap.size());  // Print size and content of the Map
	 
	        System.out.println(hmap); // Printing elements in object of Map
	 
	        // Checking if a key is present and if present, print value by passing random element
	       	        if (hmap.containsKey("vishal")) {
	 	            
	            Integer a = hmap.get("vishal");// Mapping
	 
	            // Printing value for the corresponding key
	            System.out.println("value for key" + " \"vishal\" is:- " + a);
	        }   
	       	 	hmap.containsKey("sachin");
	       	    hmap.containsValue(10);
	       	    hmap.get("vaibhav");
	       	    hmap.putIfAbsent("sachin",30);
	       	    hmap.remove("tiger");
	       	    System.out.println(hmap);
	       	    hmap.replace("sachin", 30, 456);
	       	    hmap.size();
	    }
}
