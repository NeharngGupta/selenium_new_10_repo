package miniProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript5 extends BaseClass {
	@Test
	public void clickOnApparelAndShoes() {
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Apparel & Shoes",
				"APPAREL & SHOES page is not displayed");

		Reporter.log("APPAREL & SHOES page is  displayed", true);

	}
}
