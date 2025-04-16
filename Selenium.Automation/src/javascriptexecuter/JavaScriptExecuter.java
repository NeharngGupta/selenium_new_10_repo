package javascriptexecuter;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecuter {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
JavascriptExecutor js = (JavascriptExecutor )driver;
js.executeScript("window.scrollBy(0,500)");
js.executeScript("window.scrollTo(0,800)");

	

	}

}
