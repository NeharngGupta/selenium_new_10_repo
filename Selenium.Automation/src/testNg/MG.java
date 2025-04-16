package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MG {
	public class Ferrari {
		@Test(groups="integration")
		public void launch()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.mgmotor.co.in/");
			Reporter.log("MG launched successfully",true);
		}

	}

}
