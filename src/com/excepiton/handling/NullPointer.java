package com.excepiton.handling;

public class NullPointer {
	void display() {
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException ne) {
			System.out.println(ne);
		}
	}

}
