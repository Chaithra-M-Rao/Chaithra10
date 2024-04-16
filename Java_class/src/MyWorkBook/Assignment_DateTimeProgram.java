package MyWorkBook;
import java.util.Date;


public class Assignment_DateTimeProgram {

	public static void main(String[] args) 
	{
		
		//Assignment_DateTimeProgram d=new Assignment_DateTimeProgram();
		Date d=new Date();
		System.out.println(d.getTime());
		Date d2=new Date(d.getTime());
		System.out.println(d2);
		String current_time=d2.toString();
		Date future_time=new Date(d2.getTime()+(1000*60*60*24*10)); // future time for 10 days after current day
		System.out.println(future_time);
		
		}

}
