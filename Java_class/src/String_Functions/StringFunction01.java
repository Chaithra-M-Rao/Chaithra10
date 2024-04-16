package String_Functions;

import java.util.Arrays;

public class StringFunction01 {

	public static void main(String[] args) {
		
		String name="chaithra1";
		char[] a1=name.toCharArray(); //converting string into an array like c,h,a,i..
		System.out.println(Arrays.toString(a1));
		for(int i=0;i<name.length();i++)
		{
		boolean answer= Character.isDigit(a1[i]);
		System.out.println(answer); //bcz a1[0] is c so output came as false
		}

}
}
