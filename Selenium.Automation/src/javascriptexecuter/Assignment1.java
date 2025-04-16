package javascriptexecuter;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		WebElement register = driver.findElement(By.xpath("//a[@text()='Register']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", register);
		WebElement radioBtn = driver.findElement(By.xpath("//input[@value='F']"));
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", radioBtn);
		WebElement firstN = driver.findElement(By.id("FirstName"));
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value,'Neha", firstN);
		WebElement lastN = driver.findElement(By.id("LastName"));
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value,'Neha", lastN);
		WebElement email = driver.findElement(By.id("Email"));
		JavascriptExecutor js4 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value,'nehacse@gmail.com", email);
		WebElement pwd = driver.findElement(By.id("Password"));
		JavascriptExecutor js5 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value,'nehacse12", pwd);
		WebElement cfrmpwd = driver.findElement(By.id("ConfirmPassword"));
		JavascriptExecutor js6 = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value,'nehacse12", cfrmpwd);
		WebElement reg = driver.findElement(By.xpath("input[@value='Register']"));
		JavascriptExecutor js7 = (JavascriptExecutor) driver;
		js1.executeScript("arguments[0].click()", reg);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshots/register.png");
		FileHandler.copy(temp, dest);

	}
}