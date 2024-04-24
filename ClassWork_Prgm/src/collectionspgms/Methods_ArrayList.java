package collectionspgms;

import java.util.ArrayList;

public class Methods_ArrayList {

	public static void main(String[] args) {
		
		ArrayList n=new ArrayList();
		n.add("chai");
		n.add(123);
		n.add(85);
		n.add(null);
		System.out.println(n.remove("chai"));
		
		System.out.println(n);
		ArrayList n2=new ArrayList();
		n2.addAll(n);    //obj.addAll --> it adds entire collection
		n2.add(99);
		n2.add("sammu");
		System.out.println(n2);
		System.out.println(n2.contains(858));
		ArrayList n3=new ArrayList();
		System.out.println(n2.contains(n));
		System.out.println(n.isEmpty());  // isempty fun
		
	}

}
