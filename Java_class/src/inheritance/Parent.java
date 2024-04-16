package inheritance;

public class Parent {
	void add()
	{
		System.out.println("we are in class 1");
	}
	class father extends Parent

	{
		void add()

		{
			System.out.println("we are in class 2");
		}
	}
	class mother extends father
	{
		void add()
		{
			System.out.println("we are in class 3");
		}
	}
	class kid extends father, mother
	{
		void add()
		{
			System.out.println("we are in class 4");
		}
	}
	
	

	public static void main(String[] args) {
		class kid k=new class();
		k.add();
		

	}

}
