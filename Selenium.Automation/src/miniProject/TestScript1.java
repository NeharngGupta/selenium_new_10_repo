package miniProject;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class TestScript1 extends BaseClass {
	public void clickOnBook() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Login", "Login page is not displayed");
		Reporter.log("Login page is displayed", true);

	}
}