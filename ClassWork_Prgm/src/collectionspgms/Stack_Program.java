package collectionspgms;

import java.util.Stack;

public class Stack_Program {
	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(11);
		s.addElement(25);;
		s.addFirst(0); // adds in the frist index of the array
		s.addLast(99); // adds at the last index of the array
		s.add(78);  // follows insertion order
		System.out.println(s);
		System.out.println(s.getFirst());  // returns the frist element in the list
		System.out.println(s.capacity());  //confusion bcz returns as 10
		System.out.println(s.pop());  // removes the last object
		System.out.println(s);
		System.out.println(s.peek()); //  returns the last object from the stack
		System.out.println(s.push("sammu"));
		System.out.println(s);
		
	}

}
