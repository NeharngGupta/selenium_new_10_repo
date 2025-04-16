package takesscreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment {
	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		  TakesScreenshot ts = (TakesScreenshot)driver;
		    File temp = ts.getScreenshotAs(OutputType .FILE);
		   //File dest = new File("./screenshot/image.png");
		  // FileHandler.copy(temp, dest);
		
		
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.name("email")).sendKeys("neha123@gmail.com");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("last")).click();
		File dest = new File("./screenshot/image.png");
		   FileHandler.copy(temp, dest);
		
		//driver.findElement(By.xpath("//button[text()='login']")).click();
		boolean status = driver.findElement(By.id("demoCredentials")).isDisplayed();
	System.out.println(status);
		
		
	}

}
