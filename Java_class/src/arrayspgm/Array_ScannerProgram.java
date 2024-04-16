package arrayspgm;
import java.util.Arrays;
import java.util.Scanner;

public class Array_ScannerProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the array size");
		int n=sc.nextInt();
		int a[]=new int[5];
		System.out.println("enter the elements of array");
		for(int i=0;i<5;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("the array elements are");
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
	}
		System.out.println(Arrays.toString(a));
	
	}

}
