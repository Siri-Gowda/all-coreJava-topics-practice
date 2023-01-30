package com.excepiton.handling;

public class Arith {
	void display() {
		try {
			int a = 5/0;
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
	}

}
