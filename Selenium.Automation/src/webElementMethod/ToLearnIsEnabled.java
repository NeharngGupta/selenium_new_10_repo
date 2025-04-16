package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnIsEnabled {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(3000);
		
		
		WebElement loginbutton = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(loginbutton.isEnabled());//before entering data(output=false)
		driver.findElement(By.name("username")).sendKeys("123456789");
		driver.findElement(By.name("password")).sendKeys("neha@1234");
		System.out.println(loginbutton.isEnabled());//after entering data(o/p=true)

	}

}
