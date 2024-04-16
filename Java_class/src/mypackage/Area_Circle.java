package mypackage;
import java.util.Scanner;
public class Area_Circle {
	final static double pi= 3.142;
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob1=new Scanner(System.in);
		
		System.out.println("enter value of r");
		int r=ob1.nextInt();
		double area;
		area=pi*r*r;
		System.out.println("area of a circle is ="+area);
		
		
		
	}
}
