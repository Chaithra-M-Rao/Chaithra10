package Excersie_Pgm;

import java.util.Arrays;

public class Count_Only_Alpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count_of_alpha=0;
		boolean answer;
		String name="ChaithraRao";
		char[] a=name.toCharArray();
		System.out.println(Arrays.toString(a));
		System.out.println(name.length());
		for(int i=0;i<name.length();i++)
		{
			answer=Character.isAlphabetic(a[i]);
			System.out.println(answer);
			if(answer==true)
			{
				count_of_alpha++;
			}
		}
		System.out.println("the number of alphabet value is = "+count_of_alpha);
		if(name.length()==count_of_alpha)
		{
			System.out.println("the string only consists of alphabets");
		}
		else
		{
			System.out.println("the string not consists of alphabtes");
		}

	}

}
