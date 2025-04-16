package iframe;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		driver.switchTo().frame("North Dakota");
		driver.findElement(By.id("region-35")).click();
		driver.findElement(By.linkText("Sign up"));
		driver.findElement(By.id("user")).sendKeys("nehacse24@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("76543");
		driver.findElement(By.id("cpass")).sendKeys("76543");
		driver.findElement(By.id("firstName")).sendKeys("neha");
		driver.findElement(By.id("lastName")).sendKeys("Gupta");
		driver.findElement(By.id("phone")).sendKeys("9876543210");
		driver.switchTo().defaultContent();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/img.png");
		FileHandler.copy(temp, dest);

	}
}


