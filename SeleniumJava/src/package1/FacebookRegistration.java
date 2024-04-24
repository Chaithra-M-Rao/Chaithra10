package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//assignment pgm 16/4/24
public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.get("https://www.facebook.com");
		Thread.sleep(3000);
		//d.findElement(By.linkText("Create new account"));
		WebElement s=d.findElement(By.linkText("Create new account"));
		s.sendKeys(Keys.ENTER);
		WebElement s2=d.findElement(By.name("firstname"));
		s2.sendKeys("chai");
		//incomplete
		
		d.findElement(By.id("u_2_b_sL")).sendKeys("chaithra");
	//	s.sendKeys("chaithra");
	//	s.sendKeys(Keys.ENTER);
	//	d.findElement(By.name("lastname"));
	//	s.sendKeys("rao");
		
		
	}

}
