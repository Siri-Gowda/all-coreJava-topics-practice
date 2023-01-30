package com.java.arrays;

public class ArrayEx2 {
	public static void main(String args[]) {

		int arr[] = { 100, 200, 300, 400, 500, 600 }; // we can store any num of elements
        int sum = 0;
		System.out.println(arr.length);
		for (int i : arr) {
			//System.out.println(i);
			sum = sum+i;    //100,300,600,1000,1500,2100
			System.out.println(sum);

		}
	}
}
