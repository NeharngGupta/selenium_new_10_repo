package listeners;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class AssignmentTS1 extends AssignmentBC {
	@Test
	public void login() {
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys("abhis1234@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abhis@1234");//wrong pass
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop" ,"Home page is not displayed");
		Reporter.log("Home page is diaplayed",true);
		
		
}
}