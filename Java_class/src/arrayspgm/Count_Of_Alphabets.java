package arrayspgm;

import java.util.Arrays;

public class Count_Of_Alphabets {

	public static void main(String[] args) {
		boolean ans;
		int count_of_alpha=0;
		String name="samarth123";
		char[] a=name.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<name.length();i++)
		{
		ans=Character.isAlphabetic(a[i]);
		System.out.println(ans);
	
		if(ans==true)
		{
			count_of_alpha++;
			//System.out.println("numeric is present at index=  "+i);
		}
		}
		System.out.println("the no of alphabets in the given string is = "+count_of_alpha);

	}

	}


