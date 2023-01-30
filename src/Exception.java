
//Arithmetic Exception 
public class Exception {
	void display()
	{
		try
		{
			int a = 5/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
		}
}


