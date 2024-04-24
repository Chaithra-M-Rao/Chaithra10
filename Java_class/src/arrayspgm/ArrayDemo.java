package arrayspgm;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		int age[]=new int[4];
		age[0]=21;
		age[1]=55;
		age[2]=69;
		age[3]=87;
		for(int i=0;i<4;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println(Arrays.toString(age)); // converts the array into string

	}

}
