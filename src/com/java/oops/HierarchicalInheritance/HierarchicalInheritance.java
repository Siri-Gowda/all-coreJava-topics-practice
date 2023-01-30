package com.java.oops.HierarchicalInheritance;

public class HierarchicalInheritance {
	public static void main(String args[]) {
		Child1 c1 = new Child1();
		c1.show();
		System.out.println(c1.a);
		c1.display();
		System.out.println(c1.b);
		Child2 c2 = new Child2();
		c2.display();
		System.out.println(c2.a);
		c2.dis();
		System.out.println(c2.c);
	}
}
