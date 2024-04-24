package collectionspgms;

public class Exception_Handling1 {

	public static void main(String[] args) {
		
		try
		{
			int a=0;
			int b=1;
			System.out.println(b/a);
		}
		catch(ArithmeticException e)
		{
			System.out.println("exp occured");
		}

	}

}
