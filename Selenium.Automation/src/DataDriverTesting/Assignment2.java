package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("./Testdata/commomdata.properties");// commondata

		Properties prop = new Properties();

		prop.load(fis);
		String URL = prop.getProperty("url");
		System.out.println(URL);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(URL);
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("Demo Web Shop")) {
			System.out.println("Welcome page is dislayed");
		} else {
			System.out.println("Welcome page is not displayed");

		}
		Workbook wb = WorkbookFactory.create(fis);

		String url = wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		String url1 = wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		String url2 = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		System.out.println(url);
		System.out.println(url1);
		System.out.println(url2);
	}

}
