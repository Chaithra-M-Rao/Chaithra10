package mypackage;
public class Constructor_Example2 
{
	public static void add()
	{
		int a=20;
		int b=10;
		int sum=a+b;
		System.out.println("sum="+sum);
	}
	void multi()
	{
		int a=100;
		int b=1;
		int mul=a*b;
		System.out.println("mul="+mul);
	}
	Constructor_Example2()
	{
		System.out.println("This is constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(); //sttaic method
		Constructor_Example2 c1=new Constructor_Example2();//constctor
		c1.multi();//non static
		
	}

}
