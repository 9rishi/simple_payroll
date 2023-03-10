package com.rishitha;
import java.util.*;
import java.util.function.Consumer;

public class Arraylistutilty {
	public static void main(String args[])
	{
	 ArrayList<Integer> al = new ArrayList<Integer>();
	  
	 for (int i = 10; i >= 5; i--)
 	            al.add(i);
        System.out.println(al);  
        
        al.remove(3); 
        System.out.println(al);   
	     
        for (int i = 0; i < al.size(); i++)  
            System.out.print(al.get(i) + " ");
        
        al.sort(null);            // Sorts the specified list into ascending order, 
        System.out.println(al);   //according to the natural ordering of its elements.
        
        al.add(2,55);             //Inserts  specified element at the specified position in this list.
        System.out.println(al);  
        
        ArrayList<Integer> al1= new ArrayList<Integer>();
        al1.add(3);
        al1.add(6);
        al1.add(12);
      
        al.addAll(2,al1);      //Inserts all of the elements in the specified collection into this list,
        System.out.println(al);        //starting at the specified position.
              
      //  System.out.println(al1.contains(300)); //Returns true if this list contains the specified element.
       
       // al.forEach((n) -> System.out.println(n));
        System.out.println(al.get(0));   //get at specified index
      
       System.out.println(al1);
        int m=al1.remove(1); //removes at specified index
           System.out.println(al1);
           
       System.out.println(al1.size());  // Returns the number of elements in this list.
       
       al.toArray();  //Returns an array containing all of the elements in this list from first to last element
       System.out.println(al);
       
       
	}
}