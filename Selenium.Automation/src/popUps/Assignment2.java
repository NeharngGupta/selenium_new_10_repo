package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.abhibus.com/");
	driver.findElement(By.xpath("(//div[@class='input-suffix col auto'])[3]")).click();
	int count=0;
	while(true) {
	try {
		driver.findElement(By.xpath("//span[text()='May']/../../..//span[text()='20']")).click();
		break;
		catch(Exception e) {
			if(count==0)
				driver.findElement(By.xpath(""))
		}
	}
		
	}

	}

}
