package collectionspgms;

import java.util.Set;
import java.util.TreeSet;

public class Set_Program {

	public static void main(String[] args) 
	{

		Set s1=new TreeSet();
		s1.add(25);
		s1.add(56);
		s1.add(12358);
		s1.add(85);
		s1.add(879);
		s1.remove(56);
		System.out.println(s1);
		Set s2=new TreeSet();
		s2.add(99);
		s2.add(77);
		s2.addAll(s1);
		System.out.println(s2);
		

	}

}
