package Excersie_Pgm;

public class GlobalVariableExample {

	int a=100;
	static double pi=3.14;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(pi);
		GlobalVariableExample ob=new GlobalVariableExample();
		System.out.println(ob.a);
		ob.a=200;
		System.out.println(ob.a);

	}

}
