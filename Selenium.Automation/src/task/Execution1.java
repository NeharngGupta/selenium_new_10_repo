package task;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execution1 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.abhibus.com/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.ScrollHeight)");
		driver.findElement(By.xpath("//a[text()='Hyderabad to Bangalore Bus']")).click();
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		driver.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']/..//input[@type='checkbox']"))
				.click();
	String	msg=driver.findElement(By.xpath("//div[text()='container bus-search-page page']")).getText();
System.out.println(msg);
     
	}
}
