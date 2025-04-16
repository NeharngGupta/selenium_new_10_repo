package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assignment {
	@Test(priority=1)
	public void account() {
		Reporter.log("Account is created",true);
	}
@Test(priority=2)
public void editAccount() {
	Reporter.log("Account is edited",true);
}
@Test(priority=3)
public void delAccount() {
	Reporter.log("Account is deleted",true);
}
}
