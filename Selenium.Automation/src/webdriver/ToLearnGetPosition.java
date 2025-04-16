package webdriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPosition {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Point position = driver.manage().window().getPosition();
		System.out.println(position.getX());
		System.out.println(position.getY());//capture x and y co-ordinate
		driver.manage().window().setPosition(new Point(400,200));//set xand y co-ordinate

	}

}
