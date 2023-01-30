package com.thread.methods;

public class Th extends Thread{
	public void run() {
		Thread t = currentThread();
		System.out.println(t.isAlive());
		for(int i = 0; i<=5 ;i++) {
			try
			{
				//t.sleep(2000);
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			System.out.println(i);
		}
	}

}
