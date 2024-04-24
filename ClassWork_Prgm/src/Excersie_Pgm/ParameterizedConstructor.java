package Excersie_Pgm;

public class ParameterizedConstructor {

	int x;
	ParameterizedConstructor(int y)
	{
		x=y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstructor p=new ParameterizedConstructor(7);
		System.out.println(p.x);
	}

}
