package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//assignment pgm -15/4/24
public class AmazonIndia {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.findElement(By.linkText("Customer Service")).click();
		driver.findElement(By.partialLinkText("Track packages")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("9632349500");
		driver.findElement(By.name("password")).sendKeys("Chaithra@1234");
		driver.findElement(By.id("signInSubmit")).click();
		

	}

}
