package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		WebElement status = driver.findElement(By.className("form-control"));
		System.out.println(status.isDisplayed());
		boolean status1 = driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled();
		System.out.println(status1);
		String status2 = driver.getWindowHandle();
		System.out.println(status2);
		driver.close();
	}

}
