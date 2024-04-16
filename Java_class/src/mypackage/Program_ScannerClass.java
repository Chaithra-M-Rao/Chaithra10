package mypackage;
import java.util.Scanner; 
public class Program_ScannerClass {
	
void add()
{
		 Scanner s2=new Scanner(System.in);
		 System.out.println("enter the value of a and b");
		 int a=s2.nextInt();
		 int b=s2.nextInt();
		 int sum=a+b;
		 System.out.println("sum="+sum);
		
}
void sub()
{
		 Scanner s2=new Scanner(System.in);
		 System.out.println("enter the value of a and b");
		 int a=s2.nextInt();
		 int b=s2.nextInt();
		 int subtraction=a-b;
		 System.out.println("sub="+subtraction);
}
void multi()
{
		 Scanner s2=new Scanner(System.in);
		 System.out.println("enter the value of a and b");
		 int a=s2.nextInt();
		 int b=s2.nextInt();
		 int multiplication=a*b;
		 System.out.println("mul="+multiplication);
}
void div()
{
		 Scanner s2=new Scanner(System.in);
		 System.out.println("enter the value of a and b");
		 int a=s2.nextInt();
		 int b=s2.nextInt();
		 int division=a/b;
		 System.out.println("div="+division);
}
	void modulus()
{
		 Scanner s2=new Scanner(System.in);
		 System.out.println("enter the value of a and b");
		 int a=s2.nextInt();
		 int b=s2.nextInt();
		 int mod=a%b;
		 System.out.println("mod="+mod);
		// s2.close();
}
public static void main(String[] args) {
		Program_ScannerClass p=new Program_ScannerClass();
		p.add();
		p.sub();
		p.multi();
		p.div();
		p.modulus();
		 Scanner s2=new Scanner(System.in);
		 //s2.close();
		
		
}
}
