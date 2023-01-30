package com.excepiton.handling;

public class ArrayIndex {
	void display() {
		try {
			int a[] = new int[5];
			a[6] = 10;
		}
		catch(ArrayIndexOutOfBoundsException ai) {
			System.out.println(ai);
		}
	}

}
