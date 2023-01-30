package com.java.multiThreading;

public class SingleInterface implements Runnable {
	public void run() {
		for(int i = 0;i<=5;i++) {
			System.out.println(i);
		}
		
	}

}
