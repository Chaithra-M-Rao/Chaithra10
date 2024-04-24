package arrayspgm;

import java.util.Arrays;

public class Count_Of_Numeric {

	public static void main(String[] args) {
		boolean ans;
		int count_of_num=0;
		String name="chaithra123";
		char[] a=name.toCharArray();
		System.out.println(Arrays.toString(a));
		for(int i=0;i<name.length();i++)
		{
		ans=Character.isDigit(a[i]);
		System.out.println(ans);
	
		if(ans==true)
		{
			count_of_num++;
			//System.out.println("numeric is present at index=  "+i);
		}
		System.out.println("the no of numeric in the givwn string is ="+count_of_num);

	}

}
}
