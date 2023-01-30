package com.java.multiThreading;

public class Single extends Thread{
	public void run() {
		for(int i = 0; i<=5;i++) {
			System.out.println(i);
		}
	}

}
