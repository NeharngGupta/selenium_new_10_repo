package javascriptexecuter;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		JavascriptExecutor js = (JavascriptExecutor )driver;
		js.executeScript("window.scrollBy(0,2000)");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File temp =  ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshot/image.png");
	//	FileHandler copy(temp,dest);
	}

	private static void copy(File temp, File dest) {
		// TODO Auto-generated method stub
		
	}

}
