package interfaces;
interface Google
{
	void login();
	void reg();
	
}

public class Interface_Example implements Google {

	static void myname()
	{
		System.out.println("chaithra");

	}
	public void login()
	{
		System.out.println("login done");

	}
	public void reg()
	{
		System.out.println("reg done");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 myname();
			 Interface_Example it=new Interface_Example();
			 it.login();
			 it.reg();
			 
	}

}
