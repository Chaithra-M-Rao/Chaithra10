package MyWorkBook;
import java.util.Scanner;

public class Switch_Class_Pgm {

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
}
	public static void main(String[] args) {
		
		Scanner sb=new Scanner(System.in);
		String operator;
		System.out.println("enter switch case num");
		operator=sb.next();
		Switch_Class_Pgm n=new Switch_Class_Pgm();
	
		switch(operator)
		{
		case "1" : 
				n.add();
				break;
		
		
		case "2" :
				n.sub();
				break;
		
		case "3" :
				n.multi();
				break;
				
		case "4": 
				n.div();
				break;
				
		case "5": 
				n.modulus();
				break;
			
		default : 
				System.out.println("wrong selection");
			
		}
	}
}



