package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Computer {
	@Test(groups="smoke")
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/computers");
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("users are able to click on computerlink",true);


}
}
