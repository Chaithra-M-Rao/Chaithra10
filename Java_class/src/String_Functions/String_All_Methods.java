package String_Functions;

public class String_All_Methods {

	public static void main(String[] args) {
		String s="India";
		System.out.println(s.length()); // gives  string length = 5
		System.out.println(s.charAt(4)); // in 4th index charcater a is present
		System.out.println(s.charAt(0)); // in 0th index character I is present
		System.out.println(s.toLowerCase()); //gives output as india
		System.out.println(s.toUpperCase()); // gives output as INDIA
		System.out.println(s.indexOf('n')); // n is at index position 1
		System.out.println(s.indexOf('a')); // a is at index position 4
		System.out.println(s.equals("chaithra")); // output is false bcz s=India and "chaithra" is not equal to that
		System.out.println(s.equals("India")); // output is true
		
		String m1="I am a Student";
		System.out.println(m1.substring(5)); // gives output starting from index 5
		System.out.println(m1.substring(2, 7)); // gives output stating from second index i.e a and ends at 7th index
		System.out.println(m1.concat("ofGrotechMinds")); // concats the string with given value
		String s2=" hello ";
		System.out.println(s2.trim()); // removes extra spaces
		
		
		
		
		

	}

}
