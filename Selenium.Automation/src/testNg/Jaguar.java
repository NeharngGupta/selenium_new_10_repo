package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Jaguar {
	public class Ferrari {
		@Test(groups="regression")
		public void launch()
		{
			WebDriver driver=new ChromeDriver();
			driver.get("www.jaguar.in/index.html");
			Reporter.log("Jaguar launched successfully",true);
		}

	}


}
