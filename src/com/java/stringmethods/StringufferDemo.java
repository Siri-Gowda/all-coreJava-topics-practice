package com.java.stringmethods;

public class StringufferDemo {
	public static void main(String args[]) {
		StringBuffer str = new StringBuffer("WELCOME");
		System.out.println(str);
		System.out.println(str.append(" to JAVA"));
		System.out.println(str); // in the same location the object will be updated in StringBuffer class.So
									// StringBuffer class is Mutable .
		System.out.println(str.insert(4, "HOW"));//insert is used to insert some text at the given index
		System.out.println(str.delete(4, 7)); //includes the starting index ,excludes the ending index.
		//System.out.println(str.reverse());//whatever the String we are having object that will be printed in reverse order.there is no parameter for this reverse function
		System.out.println(str.length());//in order to find out the length directly we can use length method,it will return an integer that will the length of the given String.It includes the white spaces also
		System.out.println(str.indexOf("WELCOME"));
		System.out.println(str.charAt(5));
		System.out.println(str.substring(7));
		System.out.println(str.subSequence(11,15));
		System.out.println(str);
	}
}
