package miniProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript3 extends BaseClass{
	@Test
	public void clickOnElectronics() {
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Electronics","Electronics page is displayed");
		
			Reporter.log("Electronics page is not displayed",true);

	}
}
