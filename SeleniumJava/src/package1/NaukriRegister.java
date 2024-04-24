package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//assignment pgm -15/4/24
public class NaukriRegister {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.get("https://www.naukri.com");
		Thread.sleep(3000);
	//driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("register_Layer")).click();
	Thread.sleep(3000);
	//driver.findElement(By.partialLinkText("Google")).click();
	driver.findElement(By.name("google-register")).click();
	Thread.sleep(3000);

	
	/* driver.findElement(By.id("name")).sendKeys("Chaithra M Rao");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("mobile")).sendKeys("9687451252");
		driver.findElement(By.partialLinkText("Register now")).click();
		*/
	
		}

}
