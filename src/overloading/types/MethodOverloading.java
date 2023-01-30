package overloading.types;

public class MethodOverloading {
	public void display() {
		int a =10, b = 10;
		int c = a+b;

		System.out.println("Method without parameters " +c);
	}
	public void display(int x,int y) {
		int z= x+y;
		System.out.println("Method with parameters "+ z);
	}

}
