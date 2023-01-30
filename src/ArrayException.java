//ArrayIndexOutOfBoundException
public class ArrayException {
	void display() {
		try {
			int a [] = new int [5];
			a[6] =5;
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		System.out.println("Exception Handled");
	}
}
