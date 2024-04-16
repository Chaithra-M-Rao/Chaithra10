package mypackage;

public class Example3_Feb28 {

	
	void add() {
		
		System.out.println("method overloading");
	}
	void add(int a)
	{
		System.out.println(a+7);
	}
	
	void add(int a, double b)
	{
		System.out.println(a+b);
	}
	void add(double a, int b)
	{
		System.out.println(a+b);

	}
	static void add(String a, int b,double c)
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);


	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		add("Chaithra", 30,20.69);
		
		Example3_Feb28 ob = new Example3_Feb28();
		ob.add(10,20.46);
		ob.add(30.5,7);
		ob.add();
		ob.add(5);
		
	}

}
