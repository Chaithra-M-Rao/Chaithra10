package collectionspgms;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration_Program {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(25);
		v.add(99);
		v.add(25); // allows duplicates
		v.add("gam"); //follows insertion order
		v.add(null); 
		v.add(896.356);
		v.add(null); // allows many null values 
		System.out.println(v);
		v.add(741);
		System.out.println(v);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			System.out.println(e.nextElement());
		}
		

	}

}
