package collectionspgms;

import java.util.LinkedList;

public class LinkedList_P1 {

	public static void main(String[] args) {
		
		LinkedList l=new LinkedList();
		l.add(20);
		l.add(89.25);
		System.out.println(l);
		l.addFirst(10);  // adds the element in the first position
		l.addFirst(10);  // allows duplicates
		l.add(null);
		l.add(null); // allows more than one null element
		l.addFirst(-896.2);  // allows negative elements also
		System.out.println(l);
		l.addLast("chai"); // adds the element in the last of the array
		System.out.println(l); 
		System.out.println(l.get(0));   // gives the element in index position 0
		System.out.println(l.getFirst()); // gets the first element in the array
		System.out.println(l.getLast());  // gets the last element in the array
		System.out.println(l.remove(1));  // removes the element in the first index in the array
		System.out.println(l);
		System.out.println(l.remove(1));
		System.out.println(l);
		System.out.println(l.removeFirst());
		System.out.println(l);
		l.addFirst(63);  //adds the element first in the list
		l.addLast(89745);  // adds the lement last inthe list
	System.out.println(l);
		System.out.println(l.peek());
		System.out.println(l.peekFirst());  // gives the first element in the list sa,e as getFirst
		System.out.println(l.peekLast()); // gives the last element in the list
		System.out.println(l);
		System.out.println(l.poll());  // removes the first element in the list
		System.out.println(l);
		System.out.println(l.pollFirst());   //removes the first element in the list
		System.out.println(l);
		System.out.println(l.pollLast());  // removes the last element from the list
		System.out.println(l);
		LinkedList l2=new LinkedList();
		l2.add(55);
		l2.add("vidhi");
		l2.addFirst(null); // adds null to the first index position
		l2.add(null);   // linked list allows more than one null value
		l2.add(2, 6987);
		l2.add(10);
		l2.add(55);  // allows duplicate value
		l2.add(69.36);  // follows insertion order
		System.out.println(l2);
		System.out.println(l2.offer(58));  //adds the element same as addfirst
		System.out.println(l2); 
		
		l2.addAll(l);
		System.out.println(l2);
	
		





	}

}
