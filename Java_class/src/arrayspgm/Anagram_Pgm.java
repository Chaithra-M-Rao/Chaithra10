package arrayspgm;

import java.util.Arrays;

public class Anagram_Pgm {

	public static void main(String[] args) {

		String a="horse";
		String b="shore";
		
		char[] c=a.toCharArray();
		char[] c2=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c));
		System.out.println(Arrays.toString(c2));
		boolean ans=Arrays.equals(c, c2);
				if(ans==true)
				{
					System.out.println("anangaram of each other");
				}
				else
				{
					System.out.println("not anagram");
				}

	}

}
