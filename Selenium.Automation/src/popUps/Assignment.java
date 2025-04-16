package popUps;

import java.time.Duration;

import javax.swing.Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		driver.findElement(By.xpath("//input[@value='Vote']")).click();

		Thread.sleep(2000);
		Alert popup = driver.switchTo().alert();
		popup.accept();
		String msg = popup.getText();
		System.out.println("msg");

	}
}