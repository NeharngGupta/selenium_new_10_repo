package testNg;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass {
@Test
public void clickOnElectronics() {
	driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	if(driver.getTitle().equals("Demo Web Shop. Electronics")) {
		Reporter.log("Electronics page is displayed",true);
	}
	else
		Reporter.log("Electronics page is not displayed",true);

}
}
