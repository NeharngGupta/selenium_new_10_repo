package Synchronization;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSynchronization {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(By.id("loginBtn")).click();
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		

	}

}
