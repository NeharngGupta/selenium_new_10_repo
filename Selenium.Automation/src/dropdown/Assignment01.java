package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select yearSelect = new Select(yearDropDown);
		 List<WebElement> options = yearSelect.getOptions();//get all option from drop down
		 yearSelect.selectByIndex(options.size()-1);//get last option from dropdown
		 System.out.println("1905"+options.get(options.size()-1).getText());
		driver.quit(); 
		 
	}

}
