
public class NullPointerEx {
	//NullPointerException
	void display() {
		try {
			String str = null;
			System.out.println(str.length());
		}
		catch(NullPointerException n) {
			System.out.println(n);
		}
	}

}
