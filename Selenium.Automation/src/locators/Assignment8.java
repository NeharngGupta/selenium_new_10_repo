package locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment8 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Red Bus")) {
			System.out.println("Home page is dislayed");
		} else {
			System.out.println("Home page is not displayed");

		}
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		driver.quit();
	}
}
