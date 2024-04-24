package Excersie_Pgm;

public class Handling_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try 
		{
		int c=1/0;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("handled exception success");
		}

	}

}
