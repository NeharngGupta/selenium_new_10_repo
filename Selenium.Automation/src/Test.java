import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[]args)
	{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("nehacse24@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("testkarle24");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	}
}


