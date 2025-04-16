package popUps;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();                                                                                        
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		Set<String> allwindowIds = driver.getWindowHandles();//capture window ids
		for(String id:allwindowIds)
		{
			driver.switchTo().window(id);
			System.out.println(id);
			//System.out.println(driver.getCurrentUrl());
			Thread.sleep(2000);
		}
		if(driver.getCurrentUrl()==https
				)
		{
			driver.close();
		
		}
		 
		 

	}

}
