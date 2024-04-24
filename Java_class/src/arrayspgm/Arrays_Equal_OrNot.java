package arrayspgm;

import java.util.Arrays;

public class Arrays_Equal_OrNot {

	public static void main(String[] args) {
		int num[]=new int[3];
		int num2[]=new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num2[0]=10;
		num2[1]=20;
		num2[2]=30;
		
		boolean ans=Arrays.equals(num, num2);
		System.out.println(ans);
		
		
	}

}
