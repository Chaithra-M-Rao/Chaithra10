package Excersie_Pgm;

import java.util.Arrays;

public class ReversedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numb[]=new int[5];
		int cnumber[]=new int[5];
		int k=cnumber.length-1;
		numb[0]=87;
		numb[1]=32;
		numb[2]=55;	
		numb[3]=60;
		numb[4]=10;
		for(int i=0;i<numb.length;i++)
		{
			System.out.println(numb[i]);
			cnumber[k]=numb[i];
			k--;
		}
		System.out.println(Arrays.toString(numb));
		System.out.println("reversed array is " +Arrays.toString(cnumber));
		

	}

}
