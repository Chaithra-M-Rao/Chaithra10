package Excersie_Pgm;

public class ParamConstr {

	int n;
	String s;
	
	ParamConstr(int age,String name)
	{
		n=age;
		s=name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParamConstr ob=new ParamConstr(20,"Chaithra");
		System.out.println("My age is = " +ob.n +" "+ "name is = "+ob.s );

	}

}
