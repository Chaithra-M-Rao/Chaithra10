package collectionspgms;

import java.util.Vector;

public class Vector_Program {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add(20);
		v.add(60);
		v.add(null); // vector allows null values
		v.add("chai");
		v.add(60); //  vector class allows duplicates
		v.add(89);
		v.add(null); //vector allows more than one null values
		v.addElement(859); // adds the element to the list
		System.out.println(v.firstElement()); //returns the first value in the list 
		
		System.out.println(v);
		System.out.println(v.lastElement()); //returns the last value in the list
		System.out.println(v.removeElement("chai"));  //element chai is removed from the list
		System.out.println(v);
		v.removeElementAt(2); //removes the element at the index position 2 ie null is removed from the list
		
		
		System.out.println(v);
 //v.removeAllElements(); // removes all the elements from the vector list
 System.out.println(v.capacity()); // returns 10
 //v.capacity();
 System.out.println(v);
 }

}
