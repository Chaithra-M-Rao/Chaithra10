package arrayspgm;

public class Array_Spaces_Count {
	public static void main(String[] args) {
		int space_count=0;
		boolean ans;
		String name="My Name is Chaithra ";
		char[] a=name.toCharArray();
		for(int i=0;i<name.length();i++)
		{
			ans=Character.isSpaceChar(a[i]);
			System.out.println(ans);
			if(ans==true)
			{
				space_count++;
				
			}
		}
		System.out.println("the number of spaces in the string is = "+space_count);
		
	}

}
