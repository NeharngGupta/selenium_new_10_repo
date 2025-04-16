package DataDriverTesting;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		String timestamp = LocalDateTime.now().toString().replace(":", "-");

		// Step1:create fileInputStream object
		FileInputStream fis = new FileInputStream("./Testdata/commomdata.properties");// commondata
		// step2:create respective file type object
		Properties prop = new Properties();
		// step 3:call read methods
		prop.load(fis);
		String URL = prop.getProperty("url");
		System.out.println(URL);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
	  File temp = ts.getScreenshotAs(OutputType.FILE);
	  File dest = new File("./screenshots/"+timestamp+".png");
	  
	  FileHandler.copy(temp, dest);
		
		

	}

}
