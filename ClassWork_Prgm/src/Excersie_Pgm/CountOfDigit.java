package Excersie_Pgm;

import java.util.Arrays;
public class CountOfDigit {

public static void main(String[] args) {
int count_of_num=0;
		boolean answer;
		String name="1234785";
		char[] a=name.toCharArray();
		System.out.println(Arrays.toString(a));
		System.out.println(name.length());
		for(int i=0;i<name.length();i++)
		{
			answer=Character.isDigit(a[i]);
			System.out.println(answer);
			if(answer==true)
			{
				count_of_num++;
			}
		}
		System.out.println("the number of numeric value is = "+count_of_num);
		if(name.length()==count_of_num)
		{
			System.out.println("the string only consists of digits");
		}
		else
		{
			System.out.println("the string not consists of digits");
		}
	}}
