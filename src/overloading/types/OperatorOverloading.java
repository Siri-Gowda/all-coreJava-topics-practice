package overloading.types;

public class OperatorOverloading {
	void add() {
		int a =10,b=30;
		System.out.println(" a+b = " +a+b); //+ treated as concatenation operator
		System.out.println("(a+b) = " +(a+b)); //(a+b) enclose this treated as addition operator
	}
	public static void main(String args[]) {
		OperatorOverloading obj = new OperatorOverloading();
		obj.add();
	}

}
