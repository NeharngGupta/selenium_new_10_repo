package testNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {// testng class
	@Test
	public void demo() {// Test Case

		Reporter.log("Welcome to testing", true);// test steps
	}

	@Test
	public void add() {// test case
		Reporter.log("Welcome to testNG", true);// test step
	}

	@Test
	public void register() {// test case
		Reporter.log("Welcome to Register", true);// test step
	}

	@Test
	public void login() {// test case
		Reporter.log("Welcome to login", true);// test step
	}
}
