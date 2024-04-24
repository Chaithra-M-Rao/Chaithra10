package collectionspgms;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Iteration_Pgm {

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		a1.add(100);
		a1.add(200);
		a1.add(250);
		a1.add("sum");
		a1.add(null);
		System.out.println(a1);
		Iterator i1=a1.iterator();
	while(i1.hasNext()==true)
		{
		System.out.println(i1.hasNext());
		//System.out.println(i1.next());
		}
	/*ListIterator i2=a1.listIterator();
	while(i2.hasNext()==true)
	{
		System.out.println(i2.next());
	}*/
	}

}
