package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kawasaki {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.kawasaki-india.com/");
		Reporter.log("Kawasaki is launched",true);
	}
}


