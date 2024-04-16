package mypackage;
import java.util.Scanner;
public class Assignment8_AreaOfCircle {

	static double pi=3.14;

	
	public static void main(String[] args) {
		Assignment8_AreaOfCircle ob=new Assignment8_AreaOfCircle();
		for(int i=1;i<=10;i++)
		{
			Scanner s=new Scanner(System.in);
			System.out.println("enter the value of  radius");
			int r=s.nextInt();
			double area;
			area=pi*r*r;
			System.out.println("Area= "+area);
		}
		
		

	}

}
