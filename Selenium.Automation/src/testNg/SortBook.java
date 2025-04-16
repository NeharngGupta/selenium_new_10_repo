package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SortBook {
	@Test(groups="system")
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/books?orderby=6");
		driver.findElement(By.linkText("Log in")).click();
		Reporter.log("users are able to click on computerlink",true);

}
}