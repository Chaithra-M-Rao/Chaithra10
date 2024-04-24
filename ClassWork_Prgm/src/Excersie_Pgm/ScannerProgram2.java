package Excersie_Pgm;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerProgram2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("enter array integer");
		for(int i=0;i<num.length;i++)
		{
			num[i]=s.nextInt();
		}
		System.out.println(Arrays.toString(num));

	}

}
