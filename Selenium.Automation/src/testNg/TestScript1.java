package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript1 extends BaseClass{
	@Test
	public void clickOnComputer() {
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		if(driver.getTitle().equals("Demo Web Shop. Computers")) {
			Reporter.log("Computer page is displayed",true);
		}
			else {
				Reporter.log("Computer page is not displayed",true);
		}
	}
	

}

