package com.rishitha;

public class Stringmethods {
     public static void main(String[] args) {
    	
	  String str = "rishi";
	  char ch=str.charAt(2); // indicates char at preferred index
	  System.out.println(ch);  
	  
	  int  n =str.codePointAt(2); // it returns unicode of character  
	  System.out.println(n); 
	  
	  String str1="strings ARE simutable";
	  String str2="stringbuilder is mutable";
	  int val= str1.compareTo(str2); //compares the strings
	  System.out.println(val);
	  
	  int val1 = str1.compareToIgnoreCase(str2); //compares the strings by ignoring cases
	  System.out.println(val1);
	
	  System.out.println(str1.concat(str2)); //concate method only if 2 strings there
	  
	  System.out.println( str1.contains(str2)); //conatins equal sequence are not in both strings
	
	  System.out.println(str1.replace('s', 'r'));
	  
	  String replace = str1.replaceAll("simutable","gorle"); //Replaces each substring of string 
	  System.out.println(replace);                           //  that matches gn strng
}
}
