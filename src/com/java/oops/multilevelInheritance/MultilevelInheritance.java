package com.java.oops.multilevelInheritance;

public class MultilevelInheritance {
	public static void main(String args[]) {
		CChild child = new CChild();
		System.out.println(child.a);
		child.display();
		System.out.println(child.b);
		child.show();

		System.out.println(child.c);
		child.dis();

	}

}
