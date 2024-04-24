package Excersie_Pgm;


class Login
{
	private String email="abc@gmail.com";

public String getEmail()
{
	return email;
}
public void setEmail(String email)
{
	this.email=email;
}
}
public class Encapsulation_Java {

	public static void main(String[] args) {
		
		Login l1=new Login();
		l1.setEmail("chaithra@gmail.com");
		System.out.println(l1.getEmail());

	}

}
