package Excersie_Pgm;

public class ConstructorOverloading {

	ConstructorOverloading(int a)
	{
		
	
		System.out.println("the value of a= "+a);
	}
	ConstructorOverloading(char c)
	{
		System.out.println("the value of c is = "+c);
	}
	ConstructorOverloading(String name)
	{
		System.out.println("name is = "+name);
	}
	ConstructorOverloading(boolean m)
	{
		System.out.println("m value = "+m);
	}
	ConstructorOverloading(int e, boolean g, String h)
	{
		System.out.println("the value of e , g , h  = "+e+ " "+g + " "+ " "+h);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading ob=new ConstructorOverloading(20);
		ConstructorOverloading ob8=new ConstructorOverloading(5);
		ConstructorOverloading ob1=new ConstructorOverloading('C');
		ConstructorOverloading ob3 = new ConstructorOverloading("Chaithra");
		ConstructorOverloading ob4=new ConstructorOverloading(true);
		ConstructorOverloading ob5= new ConstructorOverloading(20,false,"hello");
		

	}

}
