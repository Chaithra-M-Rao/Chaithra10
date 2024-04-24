package Excersie_Pgm;

public class ArraySixPresent {

	public static void main(String[] args) {

		int roll_no[]=new int[4];
		roll_no[0]=14;
		roll_no[1]=20;
		roll_no[2]=6;
		roll_no[3]=65;
		int num_check=6;
		for(int i=0;i<roll_no.length;i++)
		{
			if(roll_no[i]==num_check)
			{
				System.out.println("we found the number "+num_check+ " at the position "+i);
			}
			else
			{
			System.out.println("sorry not found number " +num_check+ " at position "+i);	
		}

	}
	}
}



