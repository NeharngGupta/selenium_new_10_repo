package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.getCurrentUrl();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if (url.equals("LOGIN")) {
			System.out.println("login  page is dislayed");
		} else {
			System.out.println("login page is not displayed");
		}

		driver.findElement(By.id("Email")).sendKeys("admin");
		Throws.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		Throws.sleep(2000);
		driver.findElement(By.id("Log in")).click();
		Throws.sleep(2000);
		driver.close();
	}

}
