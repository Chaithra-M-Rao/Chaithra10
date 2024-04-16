package mypackage;
import java.util.Scanner;
public class ScannerAreaCircle {
	


		public static void main(String[] args) {
			Scanner s1= new Scanner(System.in);
			System.out.println("Enter value of pi");
			double pi= s1.nextDouble();
			System.out.println("Enter value of radius");
			int radius=s1.nextInt();
			double area= pi*radius*radius;
			System.out.println(area);


	}

}
