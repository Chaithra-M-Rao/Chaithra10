package Excersie_Pgm;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysStoringElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter integer array elements");
		for(int i=0;i<num.length;i++)
		{
			num[i]=s.nextInt();
			
		}
		System.out.println(Arrays.toString(num));
		

	}

}
