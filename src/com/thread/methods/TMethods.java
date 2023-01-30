package com.thread.methods;

public class TMethods {
	public static void main(String args[]) {
		Th t = new Th();
		Th t1 = new Th();
		/*
		 * System.out.println("ID =" +t.getId()); System.out.println(" Name = "
		 * +t.getName()); t.setName("Siri");
		 * System.out.println("After changing the Thread Name "+ t.getName());
		 * System.out.println(" Priority of Thread is " + t.getPriority());
		 * t.setPriority(1); System.out.println("Priority of thread is after change " +
		 * t.getPriority());
		 */
		t.start();
		try {
			t.join();
		}catch(Exception e) {
			
		}
		System.out.println(t.isAlive());

		t1.start();
	}

}
