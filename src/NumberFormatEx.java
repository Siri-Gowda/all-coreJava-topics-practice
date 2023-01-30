
public class NumberFormatEx {
	void display() {
		try {
			String str = "Hello";
			int num = Integer.parseInt(str);
		}
		catch(NumberFormatException nf) {
			System.out.println(nf);
		}
	}

}
