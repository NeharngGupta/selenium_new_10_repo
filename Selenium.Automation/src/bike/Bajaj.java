package bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Bajaj {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bajajauto.com/");
		Reporter.log("Bajaj is launched",true);
	}
}


