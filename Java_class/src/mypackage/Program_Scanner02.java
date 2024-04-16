package mypackage;

import java.util.Scanner;

public class Program_Scanner02 {
	int a;
	int b;
	void add()
	{
			 System.out.println(a+b);
			
	}
	void sub()
	{
			 System.out.println(a-b);
	}
	void multi()
	{
			 System.out.println(a*b);
	}
	void div()
	{
			 System.out.println(a/b);
	}
	void modulus()
	{	
		 System.out.println(a%b);
	}
		
	public static void main(String[] args) {
		Scanner s3=new Scanner(System.in);
	Program_Scanner02 sc=new Program_Scanner02();
	System.out.println("enter the value of a and b");
	sc.a=s3.nextInt();
	sc.b=s3.nextInt();
	s3.close();
	sc.add();
	sc.sub();
	sc.multi();
	sc.div();
	sc.modulus();
	}
}
		
		
		

