package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args)throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books &amp; More. Best Offers!")) {
			
				System.out.println("Welcome page is dislayed");
				}
		else {
			System.out.println("Welcome page is not displayed");
		}
			Point position = driver.manage().window().getPosition();
			System.out.println(position.getX());
			System.out.println(position.getY());
			driver.manage().window().setPosition(new Point(600, 300));
			driver.manage().window().setSize(new Dimension(800,700));
			Thread.sleep(2000);
			//driver.findElement(By.id("compare")).click();
			driver.quit();
			
		}

	}
