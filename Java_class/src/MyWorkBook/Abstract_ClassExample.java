package MyWorkBook;

public class Abstract_ClassExample {
	public static void main(String[] args)
	{
		
	Cat c=new Cat();
	c.flower();
	c.sleep();
	c.plant();
	c.name();
	c.place();
	c.move();
}
}


	abstract  class Animal
	{
		abstract void name();
		abstract void place();
		void flower()
		{
			System.out.println("rose");
		}
	}
	abstract class Dog extends Animal
	{


		void name() 
		{
			System.out.println("my name is chaithra");
		}
		void place() 
		{
			
			System.out.println("my place is bengaluru");
		}
		abstract void sleep();
		abstract void move();
		void jump()
		{
			System.out.println("dog is jumping");
		}
	}
	class Cat extends Dog
	{
		void sleep()
		{
			System.out.println("cat is sleeping");

		}
		void move()
		{
			System.out.println("cat is moving");

		}
		void plant()
		{
			System.out.println("watering plants is my hobby");
		}

		
	}
	
