package arrayspgm;

public class Numberc_Check {

	public static void main(String[] args) {

		int num[]=new int[5];
		num[0]=4;
		num[1]=3;
		num[2]=2;
		num[3]=6;
		num[4]=10;
		int num_check=6;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]==num_check)
			{
				System.out.println("num found at position = "+i + " and num is = " +num_check);
			}
			else
			{
				System.out.println("not found");
			}
		}

	}

}
