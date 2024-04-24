package Excersie_Pgm;

public class LocalVariableExample {

	 void add()
	 {
		 int a=100;
		 System.out.println("a= "+a);
	 }
	 void subtract()
	 {
		 int b=200;
		 System.out.println("b= "+b);
	 }
	 void multi()
	 {
		 String m;
		 m="chaithra";
		 System.out.println("the m value = "+m);
	 }
	 static void add(int a, String b,boolean c)
	 {
		 System.out.println(a);
		 System.out.println(b);
		 System.out.println(c);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalVariableExample ob=new LocalVariableExample();
		ob.add();
		ob.subtract();
		ob.multi();
		add(35,"samartha",false);
		

	}

}
