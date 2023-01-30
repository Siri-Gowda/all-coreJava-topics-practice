package com.java.multiThreading;

public class SingleInterfaceRunnable {
	public static void main(String args[]) {
		SingleInterface s = new SingleInterface();
		Thread t = new Thread(s);
		t.start();
	}

}
