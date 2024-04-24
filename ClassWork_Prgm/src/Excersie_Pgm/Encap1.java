package Excersie_Pgm;

public class Encap1 {
	
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public static void main(String[] args) {
		
		Encap1 ec= new Encap1();
		ec.setName("chai");
		System.out.println(ec.getName());

	}

}
