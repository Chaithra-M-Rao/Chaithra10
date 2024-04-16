package mypackage;

public class Sib_Iib_Examaple {
	
	static
	{
		System.out.println("this is SIB block");
	}
	{
		System.out.println("This is IIb block");
	}
	Sib_Iib_Examaple()
	{
		System.out.println("this is a constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method");
		Sib_Iib_Examaple s= new Sib_Iib_Examaple();
		System.out.println();
		Sib_Iib_Examaple m=new Sib_Iib_Examaple(); // another object creation
	}

}
