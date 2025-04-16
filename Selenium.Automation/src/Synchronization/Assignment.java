package Synchronization;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment {
	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/");
		WebElement search = driver.findElement(By.id("men"));
		search.click();
		driver.findElement(By.xpath("//span[text()='roadster']/../..//button[text()='add to cart']")).click();
		driver.findElement(By.xpath("//button[@text()='add to cart']")).click();
		List<WebElement> allImages = driver.findElements(By.tagName("img"));
		System.out.println(allImages.size());
		WebElement ts = driver.findElement(By.xpath("//input[@id='Email']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='nehacse24@gmail.com'", ts);
		WebElement ts1 = driver.findElement(By.xpath("//input[@'Password']"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='neha77'", ts1);
		WebElement ele = driver.findElement(By.id("Login"));
		js.executeScript("arguments[0].click()", ele);
		TakesScreenshot ts11 = (TakesScreenshot) driver;
		File temp = ts11.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/" + timestamp + ".png");
		FileHandler.copy(temp, dest);

	}

}
