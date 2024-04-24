package Excersie_Pgm;

public class This_Calling_Stmt {
	
	This_Calling_Stmt()
	{
		System.out.println("this is a constructor");
	}
	This_Calling_Stmt(int a)
	{
		System.out.println("1");
	}
	This_Calling_Stmt(double b)
	{
		this(10);
		System.out.println("2");
	}
	This_Calling_Stmt(char c)
	{
		this(25.89);
		System.out.println("3");
	}
	This_Calling_Stmt(long v)
	{
		this('a');
		System.out.println("5");
	}
	public static void main(String[] args) {
		new This_Calling_Stmt(5556.258);
		new This_Calling_Stmt();
		
		
		
		

	}

}
