package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GooglePressIndiaEnter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
	WebElement sr	=driver.findElement(By.name("q"));
	sr.sendKeys("India");
	sr.sendKeys(Keys.ENTER);
	

	}

}
