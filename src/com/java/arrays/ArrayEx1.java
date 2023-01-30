package com.java.arrays;

public class ArrayEx1 {
	public static void main(String args[]) {
		int a[] = new int[5]; //declaration of array with 5 elements
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		/*for(int i = 0 ; i<= 4 ; i++) {
			System.out.println(a[i]);
		}*/
		
		//for..each loop
		for(int i:a) {
			System.out.println(i);
			
		}
		
		try {
			a[5] = 60;
		}
		catch(Exception e) {    //ArrayIndexOutOfBoundsException Handled
			System.out.println(e);
			
		}
				
		System.out.println(a.length);
	}

}

