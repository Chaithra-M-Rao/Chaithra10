package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//assignment pgm 16/4/24
public class AmazonDropDown1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver d=new ChromeDriver();
		d.get("https://www.amazon.in");
		Thread.sleep(3000);
	WebElement cat_d	=d.findElement(By.id("searchDropdownBox"));
	Thread.sleep(3000);
	Select s1=new Select(cat_d);
	s1.selectByIndex(12);
	Thread.sleep(3000);
	d.findElement(By.id("twotabsearchtextbox")).sendKeys("worldwar");
	Thread.sleep(3000);
	//d.findElement(By.id("nav-search-submit-button")).click();
	WebElement srch=d.findElement(By.id("nav-search-submit-button"));
	srch.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	//	s1.selectByValue("search-alias-lugguage");
	//s1.selectByVisibleText("Kindle Store");
	
	
	
		

	}

}
