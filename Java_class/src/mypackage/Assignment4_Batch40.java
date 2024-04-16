package mypackage;

public class Assignment4_Batch40 {

	public static void add() //static method
	{
		int a=4;
		int b=2;
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	

	public static void sub()
	{
		int a=4;
		int b=2;
		int diff=a-b;
		System.out.println("diff="+diff);
	}
	

	public static void multi()
	{
		int a=4;
		int b=2;
		int mul=a*b;
		System.out.println("mul="+mul);
	}

	public static void div()
	{
		int a=4;
		int b=2;
		int q=a/b;
		System.out.println("q="+q);
	}
	

	public static void mod()
	{
		int a=5;
		int b=2;
		int modulus=a%b;
		System.out.println("mod="+modulus);
		System.out.println();
	}
	void addition()  //non  static method
	{
		
		int a=5;
		int b=2;
		int sum1=a+b;
		System.out.println("sum1="+sum1);
	}
	void subtraction()
	{
		int a=10;
		int b=2;
		int sub1=a-b;
		System.out.println("sub1="+sub1);
	}
	void multiplication()
	{
		int a=7;
		int b=2;
		int multi1=a*b;
		System.out.println("multi1="+multi1);
	}
	void division()
	{
		int a=12;
		int b=4;
		int div1=a/b;
		System.out.println("div1="+div1);
	}
	void increment()
	{
		int i=3;
		i++;
		System.out.println("i="+i);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add();
		sub();
		multi();
		div();
		mod();

		Assignment4_Batch40 ob=new Assignment4_Batch40();
		ob.addition();
		ob.subtraction();
		ob.multiplication();
		ob.division();
		ob.increment();
		

	}

}
