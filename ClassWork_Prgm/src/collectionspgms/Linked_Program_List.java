package collectionspgms;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_Program_List {

	public static void main(String[] args) {
		
		
		//ArrayList l=new ArrayList();
		LinkedList l=new LinkedList();
		l.add(20);
		l.add(68);
		l.addFirst(85);
		l.addLast(457);
		System.out.println(l);
		l.addLast(100);
		System.out.println(l);
		System.out.println(l.removeFirst());
		System.out.println(l.peekFirst());
		System.out.println(l.peekLast());
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeLast());
		System.out.println(l);
		System.out.println(l.pollFirst());
		System.out.println(l.pollLast());
		System.out.println(l);
		
	
		//System.out.println(l);
		
		
		
		
		
	
	

	}

}
