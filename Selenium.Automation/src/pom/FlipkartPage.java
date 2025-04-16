package pom;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartPage {

	@FindBy(name="q")
	private WebElement searchTextField;
	 public FlipkartPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 public WebElement getSearchTextField()
	 {
		 return searchTextField;

	}

}
