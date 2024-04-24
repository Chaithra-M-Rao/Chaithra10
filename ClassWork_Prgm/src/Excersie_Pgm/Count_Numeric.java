package Excersie_Pgm;

public class Count_Numeric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count_numeric=0;
		boolean ans;
		String name="Chaithra128";
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			ans=Character.isDigit(a[i]);
			System.out.println(ans);
		
		if(ans==true)
		{
			count_numeric++;
		}
		}
		System.out.println("the num of numeric value in the string is = "+count_numeric);

	}

}
