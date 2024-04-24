package Excersie_Pgm;

import java.util.Arrays;

public class Alphabets {

	public static void main(String[] args) {
		
		String name="Samartha1234";
		int count_alpha=0;
		int count_digits=0;
		char[] c=name.toCharArray();
		boolean ans;
		System.out.println(Arrays.toString(c));
		for(int i=0;i<name.length();i++)
		{
			ans=Character.isAlphabetic(c[i]);
			System.out.println(ans);
		if(ans==true)
		{
			count_alpha++;
			System.out.println("no of alphabets are= "+count_alpha);
		}
		}
	}
}
		
		
		
		//System.out.println("no of alphabets are= "+count_alpha);
	/*	else if(ans==false)
		{
			count_digits++;
			System.out.println("count of digits = "+count_digits);
		}
	//	System.out.println("count of digits = "+count_digits);
		else
		{
			System.out.println("no output");
		}
		}*/
			
	

