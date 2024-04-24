package String_Functions;

public class Remove_Capitalletter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="I Am a Student";
		String output=name.replaceAll("[A-Z]"," ");
		System.out.println(output);
		String output2=name.replaceAll("[a-z]"," "); //remove small letters
		System.out.println(output2);
	}

}
