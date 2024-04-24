package Excersie_Pgm;

public class Access_Specifiers {

	
		private void m1()
		{
			System.out.println("1");
		}
		protected void m2()
		{
			System.out.println("2");
		}
		public void m3()
		{
			System.out.println("3");
		}
		void m4()
		{
			System.out.println("4");
		}
		public static void main(String[] args) 
		{
			Access_Specifiers a=new Access_Specifiers();
			a.m1();
			a.m2();
			a.m3();
			a.m4();
		}

}
