package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleOverLays {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@data-cy='closeModal']")).click();
		driver.findElement(By.xpath("//p[@data-cy='departureDay']")).click();
		//act.scrollBy.Amount(0,200).perform(); when element is not visible/when there is smaller screen
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//div[text()='March 2025']/../..//p[text()='26']")).click();
		//by usin while infinite loop
		while(true) {
	
			try {
		
		driver.findElement(By.xpath("//div[text()='August 2025']/../..//p[text()='15']")).click();
		break;
			}
			catch(Exception e) {
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		
		
		
	}

}
}
}

