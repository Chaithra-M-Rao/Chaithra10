package Excersie_Pgm;

public class CountOfAlpha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count_alpha=0;
		boolean ans;
		String name="Chaithra128";
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			ans=Character.isAlphabetic(a[i]);
			System.out.println(ans);
		
		if(ans==true)
		{
			count_alpha++;
		}
		}
		System.out.println("the num of alphabet in the string is = "+count_alpha);
			
		}

	}


