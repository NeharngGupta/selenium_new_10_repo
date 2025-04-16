package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Web Elements']")).click();
		  driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		
		driver.findElement(By.xpath("//section[text()='Click & Hold']")).click();
		WebElement mBlock = driver.findElement(By.id("mainBlock"));
		Actions act=new Actions(driver);
		act.clickAndHold(mBlock).perform();
		
		

	}

}
