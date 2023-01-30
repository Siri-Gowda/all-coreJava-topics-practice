package demo.Super.Keyword;

public class Child extends Parent{
	/*super(); implicitly called by the JVM*/
	Child(){
		System.out.println("Child Constructor");
	}
	int a = 200;
	void display() {
		System.out.println("Child");
		System.out.println(a);
		System.out.println(super.a);
		super.display();
	}

}
