package miniProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass {
	@Test
	public void clickOnComputer() {
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Computers","Computer page is not displayed");
			Reporter.log("Computer page is displayed",true);
		
	
}
}