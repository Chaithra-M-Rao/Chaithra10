package MyWorkBook;
import java.util.Scanner;

public class Assignment_Palindrome {

	public static void main(String[] args) {

		String s1="";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string value");
		String s=sc.next();
		for(int i=s.length()-1;i>=0;i--) 
		{
			char rev=s.charAt(i);
			s1=s1+rev;
		}
		
		System.out.println("the revresed string is = "+s1);
		if(s.equals(s1))
		{
				
						System.out.println("string is a palindrome");
		}
		
					
				else
				{
						System.out.println("not a palindrome");
						
					}
			
			
		}
}

		
	


