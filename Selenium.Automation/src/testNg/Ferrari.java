package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Ferrari {
	@Test(groups="smoke")
	public void launch()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ferrari.com/en-IN");
		Reporter.log("Ferrari launched successfully",true);
	}

}
