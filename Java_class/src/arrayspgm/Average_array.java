package arrayspgm;

public class Average_array {

	public static void main(String[] args) {
		
		int num[]=new int[5];
		num[0]=4;
		num[1]=3;
		num[2]=2;
		num[3]=5;
		num[4]=10;
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			sum=sum+num[i];
		}
		System.out.println(sum);
		double avg = sum/num.length;
		System.out.println(avg);
	}

}
