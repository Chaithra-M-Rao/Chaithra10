package Excersie_Pgm;

import java.util.Arrays;

public class Only_Digits {

	public static void main(String[] args) {

		String name="145875s";
		char[] c=name.toCharArray();
		System.out.println(c);
		System.out.println("length of the array is = "+name.length());
		System.out.println(Arrays.toString(c)); // prints in array format seperated by comma
		boolean ans;
		int count_digits=0;
		for(int i=0;i<name.length();i++)
		{
			ans=Character.isDigit(c[i]);
			System.out.println(ans);
			if(ans==true)
			{
			count_digits++;
			}
			//System.out.println("no of digits in the string is = "+count_digits);
		}
		System.out.println("no of digits in the string is = "+count_digits);
		if(name.length()==count_digits)
		{
			System.out.println("string only consists of digits");
		}
		else
		{
			System.out.println("string  not nly consists of digits");
		}
		
		
		

	}

}
