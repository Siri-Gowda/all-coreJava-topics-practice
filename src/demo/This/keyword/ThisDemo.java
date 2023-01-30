package demo.This.keyword;

public class ThisDemo {
	int a = 20; //instance variable 
	void display(){
		int a = 10; //local variable
		System.out.println("LOCAL VARIABLE =" +a);
		System.out.println("INSTANCE VARIABLE = " +this.a);
		
	}
	public static void main(String args[]) {
		ThisDemo obj = new ThisDemo();
		obj.display();
		
	}

}
