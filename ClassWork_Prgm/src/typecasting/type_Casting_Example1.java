package typecasting;

public class type_Casting_Example1 {

	public static void main(String[] args) 
	{
		double wt=57;  //implicitly widening(converting smaller datatype into bigger data type)
		System.out.println(wt);
		double wt2=(double)57; // explicitly widening
		System.out.println(wt2);
		
	}

}
