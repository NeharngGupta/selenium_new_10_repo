package webdriver;
//Ques-Launch instagram app in edge browser.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.instagram.com/");
	
}
}
