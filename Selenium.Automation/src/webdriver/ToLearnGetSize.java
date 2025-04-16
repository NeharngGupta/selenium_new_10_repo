package webdriver;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		Dimension size=driver.manage().window().getSize();
		System.out.println(size.getHeight());
		System.out.println(size.getWidth());
		System.out.println(size);//comb of width and Height
		driver.manage().window().setSize(new Dimension(800,700));
	}

}
