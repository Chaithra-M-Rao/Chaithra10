package collectionspgms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList_To_List {

	public static void main(String[] args) {
	
		
		List a1		=new ArrayList();
		a1.add(25);
		a1.add(56);
		a1.add(85);
		a1.add(1);
		Collections.sort(a1);
		System.out.println(a1);
	}

}
