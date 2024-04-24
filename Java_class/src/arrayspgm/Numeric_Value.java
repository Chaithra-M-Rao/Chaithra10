package arrayspgm;

import java.util.Arrays;

public class Numeric_Value {

	public static void main(String[] args) {
		boolean ans;
		String name="chaithra123";
		char[] a=name.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<name.length();i++)
		{
		ans=Character.isDigit(a[i]);
		System.out.println(ans);
	
		if(ans==true)
		{
			System.out.println("numeric is present at index=  "+i);
		}

}
}
}
