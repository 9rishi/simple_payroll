package com.rishitha;


public class StringBuffer {

	public static void main(String args[]) {

		StringBuilder str = new StringBuilder("compile ");
		// System.out.println(str.delete(0,3)); //Removes the characters in a substring

		System.out.println(str.insert(1, 'd')); // inserts the character at the index
		int n = str.lastIndexOf("mpile");
		System.out.println(n);
		String d = "Different views to match different tastes. Adjust layouts and views, use dark mode and change font size";
	
	   System.out.println((d.length() - d.replaceAll("view", "").length())/"view".length());
	}
}