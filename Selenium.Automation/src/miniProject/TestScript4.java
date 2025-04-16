package miniProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript4 extends BaseClass {
	@Test
	public void clickOnGiftCards() {
		driver.findElement(By.partialLinkText("GIFT CARDS")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Gift Cards", "Gift Cards page is displayed");

		Reporter.log("Gift Cards page is not displayed", true);

	}
}
