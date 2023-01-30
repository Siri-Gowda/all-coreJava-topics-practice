package com.excepiton.handling;

public class NumberFormat {
	void display() {
		try {
			String str = "Hello";
			int num = Integer.parseInt(str);
		}
		catch(NumberFormatException ne) {
			System.out.println(ne);
		}
	}

}
