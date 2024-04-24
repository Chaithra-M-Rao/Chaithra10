package Excersie_Pgm;

import java.util.Scanner;

//assignment on 22/3/24

public class Frog_Cat_Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num%3==0)
		{
			System.out.println("frog");
		}
		if(num%5==0)
		{
			System.out.println("cat");
		}
		if(num%3==0 && num%5==0)
		{
			System.out.println("frog and cat");
		}

}
}
