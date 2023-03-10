package com.rishitha;
import java.util.*;

public class CollectionUtilty {
	public static void main(String args[])
	{
		 /** int arr[] = new int[] { 1, 2, 3, 4 };
	        Vector<Integer> v = new Vector();
	        Hashtable<Integer, String> h = new Hashtable();

	        v.addElement(50);    // Adding the elements into the vector,insertion requires addElement()
	        v.addElement(100);
	        h.put(3, "rishi");  // Adding the element into the hashtable,element insertion requires put() 
	        h.put(45, "rishitha");
	  
	        // Array instance creation requires [],
	       
	        System.out.println(arr[2]);
	        System.out.println(v.elementAt(1));  // Accessing 2nd element of the array,using elementAt()
	        System.out.println(h.get(3));  // Accessing 3rd element of the hashtable,using get()**/
			//ArraryList
		
		/** ArrayList<Integer> al = new ArrayList<Integer>();
		  
		 for (int i = 5; i <= 10; i++)// Appending new elements at the end of the list
	 	            al.add(i);
	        System.out.println(al);  // Printing elements
	        
	        al.remove(3); // Remove element at index 3
	        System.out.println(al);  // Displaying the ArrayList after deletion
		     
	        for (int i = 0; i < al.size(); i++)   // Printing elements 
	            System.out.print(al.get(i) + " "); **/
	        //LinkedList
	        
	     /**   LinkedList<Integer> ll = new LinkedList<Integer>();
	        
	        for (int i = 1; i <= 5; i++)  // Appending new elements at   the end of the list
	            ll.add(i);
	        System.out.println(ll); // Printing elements
	  
	        ll.remove(3);  // Remove element at index 3
	  	        System.out.println(ll); // Displaying the List  after deletion
	        
	  	        for (int i = 0; i < ll.size(); i++)   // Printing elements
	            System.out.print(ll.get(i) + " "); **/
		   //Vector 
		/**Vector<Integer> v = new Vector<Integer>();
          for (int i = 100; i <= 105; i++)  // Appending new elements at the end of the list
            v.add(i);
          System.out.println(v); // Printing elements
           
          v.remove(3);  // Remove element at index 3
          System.out.println(v); // Displaying the Vector after deletion
  
           for (int i = 0; i < v.size(); i++)  // Printing elements 
            System.out.print(v.get(i) + " "); **/
		//HashSet
		
      /**  HashSet<String> hs = new HashSet<String>(); // Creating and adding elements
        hs.add("Mango");
        hs.add("is");
        hs.add("in");
        hs.add("yellow");
        hs.add("color");
  
        // Traversing elements
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
	    }**/
		//LinkedHashSet
		      
      /**  LinkedHashSet<String> lhs = new LinkedHashSet<String>();  // Creating LinkedHashSet and adding elements
        lhs.add("Helping");
        lhs.add("for");
        lhs.add("Poor");
        lhs.add("is");
        lhs.add("good");
  
        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

	}**/
		// TreeSet
		
  /**      TreeSet<String> ts = new TreeSet<String>(); // Creating  and  adding elements
        ts.add("Gokul");
        ts.add("is");
        ts.add("good");
        ts.add("boy");
        ts.add("& Very helpful");
  
        // Traversing elements
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }**/
		// HashMap
        
      /**  HashMap<Integer, String> hm = new HashMap<Integer, String>();//Creating HashMap and  adding elements
        hm.put(1, "Go");
        hm.put(2, "For");
        hm.put(3, "it");
  
        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));
        System.out.println(" " +hm.entrySet() );
        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
        **/
		/** ListInterface
		 List <T> al = new ArrayList<> (); 
  		List <T> ll = new LinkedList<> (); 
		List <T> v = new Vector<> (); 
		Where T is the type of the object */
		/** SetInterface
		 Set<T> hs = new HashSet<> (); 
         Set<T> lhs = new LinkedHashSet<> (); 
         Set<T> ts = new TreeSet<> (); 
         Where T is the type of the object.  */
		/** MapInterface
		 Map<T> hm = new HashMap<> (); 
         Map<T> tm = new TreeMap<> ();
         Where T is the type of the object. */
	}
}
