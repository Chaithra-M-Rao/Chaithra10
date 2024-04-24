package arrayspgm;

public class Program1_Exam {

	public static void main(String[] args) {
		int[] num= {3,7,2,9,4};
		int sum=0;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]%2==0)
			{
				sum=sum+num[i];
			}
			System.out.println(sum);
		}

	}

}
