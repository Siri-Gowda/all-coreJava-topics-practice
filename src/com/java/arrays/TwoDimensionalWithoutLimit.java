package com.java.arrays;

public class TwoDimensionalWithoutLimit {
	public static void main(String args[]) {
		int a[][] = {{5,10,15},{20,25,30},{35,40,45},{50,55,60},{65,70,75},{80,85,90},{95,100,200}};
		/*for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}*/
		for(int i = 0;i<=6;i++) {
			for(int j = 0;j<=2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
