package Excersie_Pgm;

public class CreationOfObjectOfNonStaticMethod {


		void add()
		{
			int a=20;
			int b=30;
			int sum=a+b;
			System.out.println("sum = "+sum);
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			{
				CreationOfObjectOfNonStaticMethod c=new CreationOfObjectOfNonStaticMethod();
				c.add();
			}

	}

}
