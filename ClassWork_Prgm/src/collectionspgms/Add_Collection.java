package collectionspgms;

import java.util.ArrayList;
import java.util.Collections;

public class Add_Collection {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		System.out.println(l);
		l.add(55);
		l.add("chaithra");
		l.add(697);
		l.add(null);
		l.add(null); // can store more than one null value
		
		l.add(10); // store duplicates
		l.add(true);// store boolean
		l.add(null);
		l.add("jamm");
		
		System.out.println(l);
		

	}

}
