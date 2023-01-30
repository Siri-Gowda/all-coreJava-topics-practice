package com.java.stringmethods;

public class StringMethods {
	public static void main(String args[]) {
		String s = "ANUSHA";    
		System.out.println(s.length()); //6 - number of characters in the string
		
		//Concatenating the Strings in 2 ways 
		String s1 = "Welcome to ";
		String s2 = "Med+";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		System.out.println("Welcome to " + "training");
		System.out.println("Welcome " .concat( s2));
		
		//Equals 
		String s3 = "APARNA";
		String s4 = "aparna";
		System.out.println(s3.equals(s4)); //false 
		System.out.println(s3.equalsIgnoreCase(s4));  //true
		
		//contains 
		System.out.println(s3.contains("APA")); //true
		System.out.println(s3.contains("anu")); //false
		
		
		//substring 
		String s5 = "WELCOME";
		System.out.println(s5.substring(0, 3));  //W E L
		System.out.println(s5.subSequence(2, 5)); // L C O
		System.out.println(s5.subSequence(4, 7));// O M E 
	   
		//replace     String s5 = "WELCOME";
		System.out.println(s5.replace('E', 'A'));
		System.out.println(s5.replaceFirst("WEL", "VEL"));
	}

}
