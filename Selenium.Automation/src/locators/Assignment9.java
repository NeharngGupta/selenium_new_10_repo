package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/Login");
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("nehacse24@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("1234");
		driver.findElement(By.xpath("input[@value='Log in']")).click();
		

	}

}
