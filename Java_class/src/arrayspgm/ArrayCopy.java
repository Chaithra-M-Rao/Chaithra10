package arrayspgm;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cnumber[]=new int[5];
		int numb[]=new int[5];
		numb[0]=87;
		numb[1]=32;
		numb[2]=55;	
		numb[3]=60;
		numb[4]=84;
		for(int i=0;i<numb.length;i++)
		{
			numb[i]=cnumber[i];
			i++;
		}
		System.out.println(Arrays.toString(numb));
		System.out.println(Arrays.toString(cnumber));
	}

}
