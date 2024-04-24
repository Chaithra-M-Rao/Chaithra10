package arrayspgm;

import java.util.Arrays;

public class Program_On_Anagram {

	public static void main(String[] args) {
		String name="horseopi";
		String name2="shore";
		char[] c=name.toCharArray();
		char[] c2=name2.toCharArray();
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(c2));
		Arrays.sort(c);
		Arrays.sort(c2);
		boolean ans=Arrays.equals(c, c2);
		if(ans==true)
		{
			System.out.println("anagaram of each other");
		}
		else
		{
		System.out.println("not");	
		}
	}

}
