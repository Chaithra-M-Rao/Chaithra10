package Excersie_Pgm;

public class AverageValueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]=new int[5];
		num[0]=10;
		num[1]=52;
		num[2]=30;
		num[3]=74;
		num[4]=60;
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
		double avg=sum/num.length;
		System.out.println(avg);

	}

}
