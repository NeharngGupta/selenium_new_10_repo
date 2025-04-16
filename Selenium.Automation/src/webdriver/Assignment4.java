package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver() ;
		driver.get(" https://www.flipkart.com/cameras/dslr-mirrorless/pr?sid=jek,p31");
		//String sourceCode=driver.getPageSource();
		//System.out.println(sourceCode);
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		driver.quit();
		

	}

}
