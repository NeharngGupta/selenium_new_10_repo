package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
		driver.get("https://www.agoda.com/");
 WebElement checkInBox = driver.findElement(By.xpath("//div[contains(@data-selenium,'check-in-box')]"));
 checkInBox.click();
 Thread.sleep(2000);
	finally 	
	}
	}
	}
