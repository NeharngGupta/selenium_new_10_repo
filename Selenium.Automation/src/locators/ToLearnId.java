package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnId {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.get("https://demowebshop.tricentis.com/");
	//	driver.get("https://www.amazon.com/");
	//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("selenium");
		//driver.findElement(By.id("small-searchterms")).sendKeys("Selenium");
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("nehacse24@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("neha");
	}

}
	