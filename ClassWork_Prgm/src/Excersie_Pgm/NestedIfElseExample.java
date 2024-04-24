package Excersie_Pgm;

public class NestedIfElseExample {

	public static void main(String[] args) {
		
		int age=20;
		double salary=20000;
		if(age>18)
		{
			
			if(salary>5000)
			{
				System.out.println("person 1");
			}
			else
			{
				System.out.println("person 2");
			}
		}
			else 
			{
				if(age==20)
				{
					System.out.println("person 3");
				}
				else
				{
					System.out.println("person 4");
				}
		}

	}

}
