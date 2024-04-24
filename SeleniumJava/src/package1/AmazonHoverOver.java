package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverOver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		Thread.sleep(2000);
		d.get("https://www.amazon.in");
		Thread.sleep(2000);
	WebElement e	=d.findElement(By.id("nav-link-accountList-nav-line-1"));
	Actions a=new Actions(d);
	a.moveToElement(e).perform();
	
		
	

	}

}
