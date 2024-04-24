package String_Functions;

public class Remove_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="I Am a fine9 Student2";
		System.out.println(name);
		String output=name.replaceAll("[0-9]"," ");
		System.out.println(output);
		String m="";
		System.out.println(m.isEmpty()); // gives true if string is empty
		String name3="water";
		System.out.println(name3.lastIndexOf('r')); //gives index value of the character
		System.out.println(name.equalsIgnoreCase("I Am a fine9 Student2"));
		String s="chai";
		//System.out.println(s.repeat(4)); // repeat string for 3 times
	}

}
