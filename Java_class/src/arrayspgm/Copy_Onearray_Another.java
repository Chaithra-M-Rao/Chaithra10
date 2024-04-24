package arrayspgm;

import java.util.Arrays;

public class Copy_Onearray_Another {

	public static void main(String[] args) {
		int num[]=new int[4];
		int num2[]=new int[4];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		for(int i=0;i<num.length;i++)
		{
			System.out.println(num[i]);
			num2[i]=num[i];
		}
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		

	}

}
