package com.java.arrays;

public class TwoDimensionalArrayEx1 {
	public static void main(String args[]) {
		int a[][] = new int[3][2]; //array declaration
		//storing elements/values into array 
		
		a[0][0] = 10;
		a[0][1] = 20;
		
		a[1][0] = 30;
		a[1][1] = 40;
		
		a[2][0] = 50;
		a[2][1] = 60;
		
/*	for(int i=0;i<=2;i++) {   //for loop 
		for(int j=0;j<=1;j++) {
			System.out.print(a[i][j]+" ");   //internal for loop 
		}
		System.out.println();
		
	}*/
		//for...each loop 
		for(int i[]:a) {
			for(int j:i) {     //internal for..each loop
				System.out.print(j+" ");
			}
			System.out.println();
		}
			
		}
	
	

}
