package com.thread.synchronization;

public class Example {
	synchronized  void display() {
		Thread g = Thread.currentThread();
		synchronized(this) {
			
		
		for(int i = 0; i<= 5;i++) {
		
		try {
			Thread.sleep(1000);
			System.out.println(g.getName());
			System.out.println(i);
		}catch(Exception e) {
		}
		}
		synchronized (this) {
			
		
		for(int i = 0; i<= 5;i++) {
			
		try {
			Thread.sleep(1000);
			System.out.println(g.getName());
			System.out.println(i);
		}catch(Exception e) {

		}
			
		}
		}
		}
	}
}
		
	


