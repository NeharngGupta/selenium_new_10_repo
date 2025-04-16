package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment3 {

	public static void main(String[] args) {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.freshersworld.com/");
		driver.findElement(By.xpath("//span[text()='REGISTER NOW']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		if(title.equals("Register in Just 2 Minutes | Freshers Registration | Start Applying Jobs | Free")) {
				System.out.println("Welcome page is dislayed");}
		else
		{
			System.out.println("Welcome page is not displayed");
			
	}
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\alokp\\OneDrive\\Desktop\\Resume_Neha.pdf");

		

	}

}
