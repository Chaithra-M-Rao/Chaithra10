package Excersie_Pgm;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age=54;
		int sal=10000;
		if(age>18 && sal>20000)
		{
			System.out.println("1");
		}
		else if(age>22 || sal <10000)
		{
			System.out.println("2");
		}
		else if(!(age==20 || sal==4000))
		{
			System.out.println("3");
		}

}
}