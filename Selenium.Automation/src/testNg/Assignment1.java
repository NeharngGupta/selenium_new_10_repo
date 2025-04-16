package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment1 {
	// Declaration
	@FindBy(linkText = "Books")
	private WebElement booklink;
	@FindBy(linkText = "Computers")
	private WebElement computerlink;
	@FindBy(id = "products-orderby")
	private WebElement orderby;

	// initialization
	public Assignment1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// getters
	public WebElement getBooklink() {
		return booklink;
	}

	public WebElement getComputerlink() {
		return computerlink;
	}

	public WebElement getOrderby() {
		return orderby;
	}

}
