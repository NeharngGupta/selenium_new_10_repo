package testNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentPF {

	public static void main(String[] args) throws IOException {
		//Step1:create fileInputStream object
				FileInputStream fis = new FileInputStream("./Testdata/commomdata.properties");//common data
				//step2:create respective file type object
				Properties prop = new Properties();
				//step 3:call read methods
				prop.load(fis);
				String URL = prop.getProperty("url");
				System.out.println(URL);
				
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				driver.get(URL);
				driver.findElement(By.linkText("Books")).click();
				driver.findElement(By.linkText("Computers")).click();
				driver.findElement(By.id("products-orderby")).click();
				
				
				
				
				
				
				
				

	}

}
