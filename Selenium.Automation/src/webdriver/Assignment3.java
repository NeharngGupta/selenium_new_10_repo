package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver() ;
		driver.get("https://www.facebook.com/");//navigation
		/*driver.get("https://www.facebook.com/");//verify url
		String url=driver.getCurrentUrl();
		System.out.println(url);*/
		String title=driver.getTitle();//title
		System.out.println(title);
		if(title.equals("Facebook – log in or sign up")) {
				System.out.println("Welcome page is dislayed");}
		else
		{
			System.out.println("Welcome page is not displayed");
			//driver.close();//close
			
	}
	}


	}


