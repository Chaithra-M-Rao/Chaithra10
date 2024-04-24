package Excersie_Pgm;

public class MethodOverloading {

	void add()
	{
		System.out.println("method overloading");
	}
	void add(int a)
	{
		System.out.println(a+10);
	}
	static void add(double a, int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add(20.587,56);
		MethodOverloading ob= new MethodOverloading();
		ob.add();
		ob.add(30);
		

	}

}
