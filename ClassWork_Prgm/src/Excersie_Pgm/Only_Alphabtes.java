package Excersie_Pgm;

import java.util.Arrays;

public class Only_Alphabtes {

	public static void main(String[] args) {
		
		String name="Vidhushana";
		char[] c=name.toCharArray();
		System.out.println(c);
		System.out.println(Arrays.toString(c));
		boolean output;
		int count_alpha=0;
		System.out.println(name.length());
		for(int i=0;i<name.length();i++)
		{
			output=Character.isAlphabetic(c[i]);
			System.out.println(output);
			
		
		if(output==true)
		{
			count_alpha++;
		}
		}
		System.out.println("the no of alphabtes in the string is= "+count_alpha );
		

		if(name.length()==count_alpha)
		{
			System.out.println("string consists of only alphabets");
		}
		else
		{
			System.out.println("only digits");
		}
		
		
		
		
	}

}
