package Excersie_Pgm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Many_CatchBlock {

	public static void main(String[] args) 
	{

		try 
		{
			Scanner s=new Scanner(System.in);
		int c=1/s.nextInt();
		System.out.println(c);
		}
		catch(ArithmeticException a)
		{
			System.out.println("handled exception success AE");
		}	
		catch(InputMismatchException b)
		{
			System.out.println("handled exception success IME");
		}	
		catch(NullPointerException c)
		{
			System.out.println("handled exception success NPE");
		}	
		catch(ArrayIndexOutOfBoundsException d)
		{
			System.out.println("handled exception success IBE");
		}
		finally
		{
			System.out.println("welcome to finally block ");
		}

	}

}
