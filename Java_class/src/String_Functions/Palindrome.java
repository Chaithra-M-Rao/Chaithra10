package String_Functions;

public class Palindrome {

	public static void main(String[] args) {
		String s="mommy";
		String t="";
		boolean ans;
		for(int i=s.length()-1;i>=0;i--)
		{
			char rev=s.charAt(i);
			t=t+rev;
		}
		System.out.println("the reversed string is ="+t);
		if(s.equals(t))
		{
			System.out.println("string is a palindrome");
		}
	else
	{
	System.out.println("not a palindrome");
	}
	}
	}
