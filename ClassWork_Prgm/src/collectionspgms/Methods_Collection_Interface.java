package collectionspgms;

import java.util.ArrayList;

public class Methods_Collection_Interface {

	public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(20);  //allows integer
	a.add("chai"); //allows string 
	a.add(56.52); // allows double data type
	System.out.println(a);
	a.add(20);   //allows duplicates
	a.add(56.52); //allows duplicates
	System.out.println(a);
	a.add(null);  //allows null value
	System.out.println(a);
	a.add(null);  // allows many null values
	System.out.println(a);
	ArrayList a2=new ArrayList();
	a2.add(78);
	a2.add("kavi");
	System.out.println(a2);
	a2.addAll(a);   // addAll method adds the previous array elements and with new array elements
	System.out.println(a2);
	System.out.println(a.contains(21)); //returns false bcz 21 is not there in the array
	System.out.println(a2.containsAll(a)); 
	// returns true if a2 contains all the elements of array a
	a.clear();
	System.out.println(a);
	System.out.println(a.isEmpty());
	a.add(65);
	a.add(88.36);
	System.out.println(a);
	a2.addAll(a);
	System.out.println(a2);
	System.out.println(a.containsAll(a2)); // returns false -->bcz a does not contain all elements of a2 
	System.out.println(a2.containsAll(a)); // returns true as a2 array contains all the elements of array a
	
	System.out.println(a);
	System.out.println(a.remove(0));
	System.out.println(a);
	a.removeAll(a);
	System.out.println(a);
	System.out.println(a2);

	a2.removeAll(a);
	System.out.println(a2);
	System.out.println(a2.size());
	a2.clear();
	System.out.println("after clearing = "+a2);
	
	//System.out.println();
	
	
	}

}
