package mypackage;

public class Assignment5_Batch40 {
	
	Assignment5_Batch40()
	{
		System.out.println("this is a constructor");
	}
	Assignment5_Batch40(int age)
	{
		//age=20;
		System.out.println("age is= "+age);
	}
	Assignment5_Batch40(char value)
	{
		//value='A';
		System.out.println("Value= "+value);
	}
	Assignment5_Batch40(String name)
	{
		//name="chaithra";
		System.out.println("name= "+name);
	}
	Assignment5_Batch40(boolean m)
	{
		//m=true;
		System.out.println("boolean value m= "+m);
	}
	Assignment5_Batch40(int a, boolean b, String c)
	{
		//a=20;
		//b=false;
		//c="Chaithra";
		System.out.println("value of a is="+a);
		System.out.println("value of b is="+b);
		System.out.println("value of c is="+c);

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Assignment5_Batch40();
		new Assignment5_Batch40(40);
		new Assignment5_Batch40('A');
		new Assignment5_Batch40("Chaithra");
		new Assignment5_Batch40(true);
		new Assignment5_Batch40(10,false,"this is a string type");
		
		

	}

}
