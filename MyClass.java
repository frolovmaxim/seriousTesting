package newpackage;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@SuppressWarnings("unused")
public class MyClass {
	public static void main(String[] args) {
			//System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
			//WebDriver driver = new FirefoxDriver();
			System.setProperty("webdriver.Сhrome.driver","/Users/maximfrolov/‎⁨chromedriver");
			WebDriver driver = new ChromeDriver();
		
		String baseUrl = "http://demo.guru99.com/test/newtours/";
		String expectedTitle = "Welcome: Mercury Tours";
		String actualTitle = "";
		
		driver.get(baseUrl);
		
		actualTitle = driver.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed!");
		} else {
			System.out.println("Test Failed!");
		}
		
		driver.close();
		
	}
}
