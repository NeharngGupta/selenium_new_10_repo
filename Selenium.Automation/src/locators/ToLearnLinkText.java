package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnLinkText {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demowebshop.tricentis.com/");
	driver.findElement(By.linkText("Register")).click();
	driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.id("FirstName")).sendKeys("neha");
	driver.findElement(By.id("LastName")).sendKeys("gupta");
	driver.findElement(By.id("Email")).sendKeys("nehacse24@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456");
	driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
	driver.findElement(By.id("register-button")).click();
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.id("Email")).sendKeys("nehacse24@gmail.com");
	driver.findElement(By.id("Password")).sendKeys("123456");
	driver.findElement(By.id("Log in")).click();
	}

}
