package com.java.arrays;

public class ObjectArray {
	public static void main(String args[]) {
		Object a[] = new Object[6]; // we can store all the multiple datatype of elements in object array 
		a[0] = 1;
		a[1] = 'A';
		a[2] = "Anu";
		a[3] = "M.Pharmacist";
		a[4] = 89.09;
		a[5] = true;
		for(Object i:a) {
			System.out.println(i);
		}
		
		
	}

}
