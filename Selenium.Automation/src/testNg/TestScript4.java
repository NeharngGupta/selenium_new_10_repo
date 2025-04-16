package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript4 extends BaseClass{
	@Test
	public void clickOnApparelAndShoes() {
		driver.findElement(By.partialLinkText("APPAREL & SHOES")).click();
		if(driver.getTitle().equals("Demo Web Shop. Apparel & Shoes")) {
			Reporter.log("APPAREL & SHOES page is displayed",true);
		}
		else
			Reporter.log("APPAREL & SHOES page is not displayed",true);

	}
}
