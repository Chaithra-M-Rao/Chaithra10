package arrayspgm;

import java.util.Arrays;

public class Space_Count {

	public static void main(String[] args) {
		boolean ans;
		int count_of_space=0;
		String name="samarth 123 rao ";
		char[] a=name.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<name.length();i++)
		{
		ans=Character.isSpace(a[i]);
		System.out.println(ans);
	
		if(ans==true)
		{
			count_of_space++;
			//System.out.println("numeric is present at index=  "+i);
		}
		}
		System.out.println("the no of spaces in the given string is = "+count_of_space);

	}

	}


